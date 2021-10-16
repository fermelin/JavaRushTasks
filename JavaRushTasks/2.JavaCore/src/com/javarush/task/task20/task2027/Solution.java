package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/

public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> list = detectAllWords(crossword, "home", "same");
        for (Word word : list) {
            System.out.println(word);
        }
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> list = new ArrayList<>();
        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            boolean isWordFound = false;
            for (int y = 0; y < crossword.length; y++) {
                for (int x = 0; x < crossword[0].length; x++) {
                    if (words[wordIndex].charAt(0) == crossword[y][x]) {
                        isWordFound = detectOneWord(list, crossword, words[wordIndex], y, x);
                    }
                    if (isWordFound) break;
                }
                if (isWordFound) break;
            }
        }
        return list;
    }
    private static boolean detectOneWord(List<Word> list, int[][] crossword, String word, int y, int x) {
        int deltaX = 0;
        int deltaY = 0;
        if (word.length() == 1) {
            addNewWordToList(list, word, new int[]{y,x}, new int[]{y,x});
            return true;
        }
        if (x != 0 && y != 0 && crossword[y - 1][x - 1] == word.charAt(1)) {
            deltaY = -1;
            deltaX = -1;
            if (isWordDetected(list, crossword, word, y, x, deltaY, deltaX)) return true;
        }
        if (y != 0 && crossword[y - 1][x] == word.charAt(1)) {
            deltaY = -1;
            if (isWordDetected(list, crossword, word, y, x, deltaY, deltaX)) return true;
        }
        if (y != 0 && x + 1 < crossword[y].length && crossword[y - 1][x + 1] == word.charAt(1)) {
            deltaY = -1;
            deltaX = 1;
            if (isWordDetected(list, crossword, word, y, x, deltaY, deltaX)) return true;
        }
        if (x != 0 && crossword[y][x - 1] == word.charAt(1)) {
            deltaX = -1;
            if (isWordDetected(list, crossword, word, y, x, deltaY, deltaX)) return true;
        }
        if (x + 1 < crossword[y].length && crossword[y][x + 1] == word.charAt(1)) {
            deltaX = 1;
            if (isWordDetected(list, crossword, word, y, x, deltaY, deltaX)) return true;
        }
        if (y + 1 < crossword.length && x != 0 && crossword[y + 1][x - 1] == word.charAt(1)) {
            deltaY = 1;
            deltaX = -1;
            if (isWordDetected(list, crossword, word, y, x, deltaY, deltaX)) return true;
        }
        if (y + 1 < crossword.length && crossword[y + 1][x] == word.charAt(1)) {
            deltaY = 1;
            if (isWordDetected(list, crossword, word, y, x, deltaY, deltaX)) return true;
        }
        if (y + 1 < crossword.length && x + 1 < crossword[y].length && crossword[y + 1][x + 1] == word.charAt(1)) {
            deltaY = 1;
            deltaX = 1;
            if (isWordDetected(list, crossword, word, y, x, deltaY, deltaX)) return true;
        }
        return false;
    }

    private static boolean isWordDetected(List<Word> list, int[][] crossword, String word, int y, int x, int deltaY, int deltaX) {
        try {
            int y1 = y;
            int x1 = x;
            for (int letterIndex = 1; letterIndex < word.length(); letterIndex++) {
                y1 += deltaY;
                x1 += deltaX;
                if (crossword[y1][x1] != word.charAt(letterIndex)) return false;
            }
            addNewWordToList(list, word, new int[]{y,x}, new int[]{y1,x1});
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }
    private static void addNewWordToList(List<Word> list, String wordToAdd, int[] startYX, int[] endYX) {
        Word word = new Word(wordToAdd);
        word.setStartPoint(startYX[1], startYX[0]);
        word.setEndPoint(endYX[1], endYX[0]);
        list.add(word);
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}

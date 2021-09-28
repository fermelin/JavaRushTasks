package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
    }
    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public Rectangle(Rectangle other) {
        this.top = other.top;
        this.left = other.left;
        this.width = other.width;
        this.height = other.height;
    }
    public static void main(String[] args) {

    }
}

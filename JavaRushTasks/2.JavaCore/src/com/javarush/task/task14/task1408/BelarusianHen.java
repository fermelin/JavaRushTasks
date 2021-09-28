package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    private static final int EGGS_PER_MONTH = 28;

    public int getCountOfEggsPerMonth() {
        return EGGS_PER_MONTH;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
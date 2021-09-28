package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    private static final int EGGS_PER_MONTH = 25;

    @Override
    public int getCountOfEggsPerMonth() {
        return EGGS_PER_MONTH;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

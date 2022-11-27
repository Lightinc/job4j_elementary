package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightman = 195;
        double man = Fit.manWeight(heightman);
        System.out.println("Man 195 is " + man);

        short heightwoman = 177;
        double woman = Fit.womanWeight(heightwoman);
        System.out.println("Woman 177 is " + woman);

    }

}
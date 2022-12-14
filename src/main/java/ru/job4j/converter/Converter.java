package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(210);
        System.out.println("210 rubles are " + euro + " euro.");

        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");

        float in = 210;
        float expected = 3;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles are " + expected + ". Test result : " + passed);

        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}
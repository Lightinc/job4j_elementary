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

        float in1 = 210;
        float expected1 = 3;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("210 rubles are 3. Test result : " + passed1);

        float in2 = 180;
        float expected2 = 3;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3. Test result : " + passed2);
    }
}
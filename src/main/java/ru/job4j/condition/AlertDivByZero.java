package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.print("This is negative number");
            }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(1);
        AlertDivByZero.possibleDiv(-5);
    }
}
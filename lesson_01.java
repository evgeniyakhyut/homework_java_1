package ru.geekbrains;

public class lesson_01 {
    public static double calculate(int a, int b, int c, int d) {
        float af = (float) a;
        float bf = (float) b;
        float cf = (float) c;
        float df = (float) d;

        return af * (bf + (cf / df));
    }

    public static boolean isInLimits(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositive(int a) {
        if (a < 0) {
            System.out.println("Your number is negative!");
        } else {
            System.out.println("Your number is positive!");
        }
    }

    public static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void isLeap(int year) {
        /*if (year % 4 == 0) {
           *//* if (year % 400 == 0) {
                System.out.println(year + " is leap year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not leap year");
            } else {
                System.out.println(year + " is leap year");
            }*//*

            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " is not leap year");
            } else {
                System.out.println(year + " is leap year");
            }
        } else {
            System.out.println(year + " is not leap year");
        }*/

        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing calculate():");
        System.out.println(calculate(5, 6, 8, 9));

        System.out.println("Testing isInLimits():");
        System.out.println(isInLimits(5, 6));
        System.out.println(isInLimits(15, 6));

        System.out.println("Testing isPositive():");
        isPositive(-20);
        isPositive(158);

        System.out.println("Testing greet():");
        greet("Олег");
        greet("Димон");

        System.out.println("Testing isLeap():");
        isLeap(1600);
        isLeap(8);
        isLeap(1601);
        isLeap(1700);
        isLeap(101);
        isLeap(800);
        isLeap(100);
        isLeap(400);
        isLeap(404);
    }
}

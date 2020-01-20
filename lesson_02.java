package ru.geekbrains.arrays_lesson_02;

import java.util.Arrays;

public class lesson_02 {

    //1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

    public static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    //2 Задать пустой целочисленный массив размером 8.
    // Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

    public static void fillArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i > 0 ? arr[i - 1] + 3 : 1;
        }
    }

    //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    // написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;

    public static void multiplyByTwo(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    //4 Задать одномерный массив. Написать методы поиска в нём
    // минимального и максимального элемента;

    public static int minOfArray(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxOfArray(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    //    заполнить его диагональные элементы единицами, используя цикл(ы);

    public static void diagonalley(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][((arr.length - 1) - i)] = 1;
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
    }

    // 6 ** Написать метод, в который передается непустой одномерный целочисленный массив,
    //  метод должен вернуть true если в массиве есть место, в котором сумма
    //  левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
    //  checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true.
    //  Абстрактная граница показана символами ||, эти символы в массив не входят.

    public static boolean checkBalance(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            sumLeft = sumLeft + arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                sumRight = sumRight + arr[j];
            }

            if (sumLeft == sumRight) {
                return true;
            }

            sumRight = 0;
        }

        return false;
    }


    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeArray(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[8];
        fillArray(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyByTwo(arr3);
        System.out.println(Arrays.toString(arr3));


        int[] arr4 = new int[]{1, 5, 3, 2, 11, 4, -25, 2, 4, -8, 198, 1};
        System.out.println("min = " + minOfArray(arr4));
        System.out.println("max = " + maxOfArray(arr4));

        int n = 8;
        int m = n;
        int[][] arr5 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr5[i][j] = 0);
            }
            System.out.println();
        }

        diagonalley(arr5);
        System.out.println(Arrays.toString(arr5));

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5.length; j++) {
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[]{10, 1, 2, 3, 4}));
    }
}

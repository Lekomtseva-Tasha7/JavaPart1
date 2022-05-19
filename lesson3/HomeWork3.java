package homework3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
        //[ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] intArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(intArray));
        for (i = 0; i < 10; i++) {
            if (intArray[i] == 1) {
                intArray[i] = 0;
            } else {
                intArray[i] = 1;
            }
        }
        System.out.println(Arrays.toString(intArray));
        i = 0;

        //2. Задать пустой целочисленный массив длиной 100.
        //С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arreyLong100 = new int[100];
        System.out.println(Arrays.toString(arreyLong100));
        for (i = 0; i < 100; i++) {
            arreyLong100[i] = i + 1;
        }
        System.out.println(Arrays.toString(arreyLong100));
        i = 0;

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        //пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] multiplyArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplyArray));
        for (i = 0; i < multiplyArray.length; i++) {
            if (multiplyArray[i] < 6) {
                multiplyArray[i] = multiplyArray[i] * 2;
            }
        }
        System.out.println(Arrays.toString(multiplyArray));
        i = 0;

        //4. Создать квадратный двумерный целочисленный массив
        //(количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами (можно только одну
        // из диагоналей, если обе сложно).
        int n = 5;
        int[][] squareArray = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j || j == n - 1 - i) {
                    squareArray[i][j] = 1;
                }
                System.out.print(squareArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        //и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
        int [] array = fillArray(5, 7);
        System.out.println(Arrays.toString(array));
    }
    public static int[] fillArray(int len, int initialValue) {
        int[] myArray = new int[len];
        int i = 0;
        for (i = 0; i < len; i++) {
            myArray[i] = initialValue;
        }
        return myArray;
    }
}
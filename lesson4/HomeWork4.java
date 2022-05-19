package homework4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static char[][] map;
    public static int SIZE = 3;
    public static char DOT_EMPTY = '•'; //символ пустого поля
    public static char DOT_X = 'X'; //символ хода человека
    public static char DOT_O = 'O'; //символ хода ПК

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanMove();
            if (isWinner(DOT_X) || isWinnerD(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            computerMove();
            if (isWinner(DOT_O) || isWinnerD(DOT_X)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    //Заполняем матрицу пустыми значениями (точками)
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //Печатаем матрицу
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Ход человека
    public static void humanMove() {
        int x, y;
        do {
            System.out.print("Введите координаты хода (х y): ");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        map[y][x] = DOT_X;
        printMap();
    }

    //Ход ПК
    public static void computerMove() {
        int x, y;
        do {
            Random compRandom = new Random();
            x = compRandom.nextInt(SIZE);
            y = compRandom.nextInt(SIZE);
        }
        while (!isCellValidComp(x, y));
        System.out.print("Ход компьютера: х=" + (x + 1));
        System.out.print("; y=" + (y + 1));
        map[y][x] = DOT_O;
        System.out.println();
        printMap();
    }

    // Проверка вводимых человеком координат
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            System.out.println("Координаты вне поля");
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        } else {
            System.out.println("Поле занято. Попробуйте еще раз");
            return false;
        }
    }

    // Проверка вводимых ПК координат (без комментариев)
    public static boolean isCellValidComp(int x, int y) {
        if (map[y][x] == DOT_EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    // Проверка заполненности кода
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    //Проверка на победу
    public static boolean isWinner(char symb) {
        for (int i = 0; i < SIZE; i++) {
            int a = 0; //счетчик горизонтальных рядов
            int b = 0; //счетчик вертикальных рядов
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    a++;
                }
                if (map[j][i] == symb) {
                    b++;
                }
            }
            if (a == SIZE || b == SIZE) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWinnerD(char symb) {
        int c = 0; //счетчик прямой диагоняли
        int d = 0; //счетчик обратной диагонали
        for (int k = 0; k < SIZE; k++) {
            if (map[k][k] == symb) {
                c++;
            }
            if (map[SIZE - 1 - k][SIZE - 1 -k] == symb) {
                d++;
            }
            }
            if (c == SIZE || d == SIZE) {
                return true;
            }
        return false;
    }
}


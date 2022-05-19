package homework1;

// Практическая работа №1
public class HomeWork1 {
    public static void main(String[] args) { // п.1 ДЗ-1
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() { // п.2 ДЗ-1
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() { // п.3 ДЗ-1
        int a, b; // Объявляем переменные
        a = -10; // Инициируем переменные
        b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() { // п.4 ДЗ-1
        int value = -10; // Объявляем и инициируем переменную
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) { // && = И
            System.out.println("Желтый");
            }
        if (value > 100) {
            System.out.println("Зеленый");
            }
        }
    public static void compareNumbers() {
        int a, b;
        a = 10;
        b = 20;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
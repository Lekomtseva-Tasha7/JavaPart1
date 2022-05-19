package homework2;

public class HomeWork2 {
    public static void main(String[] args) {
        int q = 1;
        int w = 19;
        boolean e = checkingTheAmount (q, w);
        System.out.println(e); // проверка результата
        int r = -0;
        positiveOrNegativeNumber (r);
        int t = 21;
        boolean y = positiveItIstrue (t);
        System.out.println(y); // проверка результата
        int i = 4;
        String u = "Солнышко";
        printText (i, u);
    }
    //Метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean checkingTheAmount (int a, int b) {
        boolean c;
        if (10 <= a + b && a + b <= 20) {
            c = true;
            return c;
        }
        else {
            c = false;
            return c;
        }
    }
    //Метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //(Ноль считаем положительным числом)
    public static void positiveOrNegativeNumber (int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }
    }
    //Метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean positiveItIstrue (int a) {
        boolean b;
        if (a < 0) {
            b = true;
            return b;
        }
        else {
            b = false;
            return b;
        }
    }
    //Метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз.
    public static void printText (int b, String massage) {
        for (int a = 0; a < b; a++)
            System.out.println (massage);
    }
}

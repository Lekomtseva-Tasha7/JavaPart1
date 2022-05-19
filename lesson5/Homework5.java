package homework5;

import homework5.Employee;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

       //4. Создать массив из 5 сотрудников
        Employee[] persArray = new Employee [5];
        persArray [0] = new Employee ("Балакина Екатерина", "Начальник отдела", "balakina-ea@ural.rt.ru", "376-20-54", 60000, 40);
        persArray [1] = new Employee ("Аверьякова Наталья", "Главный специалист", "averiakova-ng@ural.rt.ru", "379-15-25", 50000, 45);
        persArray [2] = new Employee ("Пермякова Елена", "Ведущий специалист", "permiakova-em@ural.rt.ru", "354-40-80", 36000, 51);
        persArray [3] = new Employee ("Шапошникова Мария", "Регистратор", "shaposhnikova-ms@ural.rt.ru", "379-12-00", 25000, 28);
        persArray [4] = new Employee ("Кунц Яна", "Секретарь", "kunz-yai@ural.rt.ru", "354-96-76", 38000, 32);

        //5.С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        System.out.println("Старше сорока: ");
        for (int i = 0; i < 5; i++) {
            persArray[i].Fourty();
        }
        System.out.println();
        System.out.print("Введите номер сотрудника: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt() - 1;
        System.out.println("Информация о сотруднике:");
        persArray[x].printInfo();
    }
}
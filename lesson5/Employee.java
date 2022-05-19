package homework5;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;


    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    Employee (String Name, String Position, String Email, String Phone, int Salary, int Age) {
        this.name = Name;
        this.position = Position;
        this.email = Email;
        this.phone = Phone;
        this.salary = Salary;
        this.age = Age;
    }

    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void printInfo (){
        System.out.println("Ф.И.О. сотрудника: " + name);
        System.out.println("Должность: " + position);
        System.out.println("e-mail: " + email);
        System.out.println("телефон: " + phone);
        System.out.println("Заработная плата: " + salary);
        System.out.println("Возраст: " + age);
    }


    //5.С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    public void Fourty () {
        if (age <= 40) {
            return;
        }
            System.out.println("Ф.И.О. сотрудника: " + name);
            //System.out.println("Должность: " + position);
            //System.out.println("e-mail: " + email);
            //System.out.println("телефон: " + phone);
            //System.out.println("Заработная плата: " + salary);
            //System.out.println("Возраст: " + age);
        }
}

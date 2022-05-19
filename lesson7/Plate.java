package homework7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public void info () {
        System.out.println("В тарелке " + food + " ложек еды");
    }

    public void decreaseFood (int appetite) {
        if (adequacy(appetite) == true) {
            this.food -= appetite;
       }
       else {
           System.out.println("Нехватает еще " + (appetite-food) + " ложек. Сколько добавим еды в тарелку?: ");
           Scanner scanner = new Scanner(System.in);
           food = food + scanner.nextInt();
           info();
        }
    }

    public boolean adequacy (int appetite) {
        if (food >= appetite) {return true;}
        else return false;
    }
}

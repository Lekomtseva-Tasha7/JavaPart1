package homework7;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Plate myPlate = new Plate(25);
        int n = 5;
        Cat [] myCat = new Cat [n];
        myCat[0] = new Cat ("Гансик", 5);
        myCat[1] = new Cat ("Пушок", 7);
        myCat[2] = new Cat ("Бася", 10);
        myCat[3] = new Cat ("Пончик", 15);
        myCat[4] = new Cat ("Барсик", 6);

        myPlate.info();

        for (int i = 0; i < n; i++) {
            if (myCat[i].eat(myPlate) == false) {
                myCat[i].eat(myPlate);
            }
        }
    }
}

package homework6;

public class HomeWork6 {
    public static void main(String[] args) {

        Cat[] myCat = new Cat[4];
        myCat [0] = new Cat("Барсик");
        myCat [1] = new Cat("Снежок");
        myCat [2] = new Cat("Мурзик");
        myCat [3] = new Cat("Ганс");

        Dog[] myDog = new Dog[5];
        myDog [0] = new Dog("Бобик");
        myDog [1] = new Dog("Тузик");
        myDog [2] = new Dog("Лика");
        myDog [3] = new Dog("Кучум");
        myDog [4] = new Dog("Грант");

        myCat[0].swim(150);
        myCat[3].run(250);
        myCat[2].run(150);
        myDog[4].run(500);
        myDog[3].swim(10);
        myDog[1].run(600);
        myDog[0].swim(100);


    }
}
package homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        full = false;
    }

    public boolean eat (Plate plate) {
        if (plate.adequacy(appetite) == true) {
            plate.decreaseFood(appetite);
            System.out.println("Котик " + name + " съел " + appetite + " ложек и наелся.");
            return true;
        }
        else {
            System.out.println("Котик " + name + " хотел съесть " + appetite + " ложек, но ему не хватило и он остался голодный.");
            plate.decreaseFood (appetite);
            return false;
        }
    }
}

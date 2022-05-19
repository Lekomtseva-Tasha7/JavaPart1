package homework6;

public class Animal {
    protected String name;

    public Animal (String name) {
        this.name = name;
    }

    public void run(int distance){
        if (distance  <= 500) {
        System.out.println(name + " пробежал " + distance + "м");
        }
        else {System.out.println(name + " больше 500м не пробежит");}
    }

   public void swim(int distance) {
       if (distance <= 10) {
           System.out.println(name + " проплыл " + distance + "м");
       }
       else {System.out.println(name + " больше 10м не поплывет");}
   }
}

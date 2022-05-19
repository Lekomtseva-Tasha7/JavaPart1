package homework8;

import java.util.Random;
import java.util.Scanner;

public class HomeWork8 {
    public static void main (String [] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random hiddenWord = new Random();
        int x = hiddenWord.nextInt(words.length);
        System.out.println("У меня есть вот такой салатик:");
        for (int i = 0; i < words.length; i++) {
            if (i == words.length-1) {
                System.out.println(words[i] + ".");
            }
            else {System.out.print(words[i] + ", ");}
        }

        System.out.println();
        System.out.println("Угадай какое слово я загадал? " + words[x]);
        char[] myArray = new char[15];
        for (int w=0; w < 15; w++) {
            myArray[w] = ('#');
            System.out.print(myArray[w]);
        }
        System.out.println();

        String humanWord = "#";

        while (!words[x].equals(humanWord)) {

        Scanner scanner = new Scanner(System.in);
        humanWord = scanner.nextLine();

            int shortest;
            if (words[x].length() - humanWord.length() <= 0) {
                shortest = words[x].length();
            } else shortest = humanWord.length();

            for (int i = 0; i < shortest; i++) {
                if (words[x].charAt(i) == humanWord.charAt(i) && myArray[i] == '#') {
                    myArray[i] = words[x].charAt(i);
                }
            }

            for (int j = 0; j < 15; j++) {
                System.out.print(myArray[j]);
            }
            System.out.println();
        }
        System.out.println("Молодец! Угадал :)");
    }
}

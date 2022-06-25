package Lesson4;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word about weather: ");
        String word = input.next();
        switch (word) {
            case "warm":
                System.out.println("teplo");
                break;
            case "cold":
                System.out.println("holodno");
            case "sunny":
                System.out.println("colnechno");
                break;
            case "rainy":
                System.out.println("dochdlivo");
                break;
            case "windy":
                System.out.println("vetrenno");
                break;
            case "foggy":
                System.out.println("tumano");
                break;
            case "snowy":
                System.out.println("cnechno");
                break;
            case "chilly":
                System.out.println("Zabko");
                break;
            case "dry":
                System.out.println("cyxo");
                break;
            case "cloudy":
                System.out.println("oblachno");
                break;
            default:
                System.out.println("No word");
                break;
        }
    }
}

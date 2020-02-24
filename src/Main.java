import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Solution 1
        System.out.println("Enter a text:");

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        Random random = new Random();
        int shift = random.nextInt(26);

        for (int i = 0; i < text.length(); i++) {
            int newChar = text.charAt(i) + shift;
            if (Character.isLowerCase(newChar)) {
                if (newChar > 'z') {
                    System.out.print((char) ('a' + (newChar - 'z' - 1)));
                } else {
                    System.out.print((char) newChar);
                }
            } else if (Character.isUpperCase(newChar)) {
                if (newChar > 'Z') {
                    System.out.print((char) ('A' + (newChar - 'Z' - 1)));
                } else {
                    System.out.print((char) newChar);
                }
            }

        }

        /*
        //Solution book
        char letter = 'V';
        int rotation = 6;
        int start = 'A';

        System.out.println(letter);
        System.out.println((int) letter);
        System.out.println(start);

        letter -= (start - 1);

        System.out.println(letter);
        System.out.println((int) letter);
        System.out.println(start);

        letter += rotation;

        System.out.println(letter);
        System.out.println((int) letter);

        letter %= 26;

        System.out.println(letter);
        System.out.println((int) letter);

        letter += (start - 1);

        System.out.println(letter);
        System.out.println((int) letter);
        */

    }
}

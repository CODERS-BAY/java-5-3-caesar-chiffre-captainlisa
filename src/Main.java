import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a text:");

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();


        Random random = new Random();
        int shift = random.nextInt(26);

        for (int i = 0; i < text.length(); i++) {
            int newChar = text.charAt(i) + shift;
            if (newChar > 'z') {
                System.out.print((char)('a' + (newChar - 'z' - 1)));
            } else {
                System.out.print((char)newChar);
            }
        }


    }
}

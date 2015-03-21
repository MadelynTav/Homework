package nyc.c4q.madelyntav;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What size would you like your box to be? Enter a number: ");
        int size = scanner.nextInt();

        for (int j = 1; j <= size; j++) {
            for (int i = 1; i <= size; i++) {
                if ((i % j == 0) || (j % i == 0)) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}

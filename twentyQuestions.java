package nyc.c4q.madelyntav;

/**
 * Created by c4q-madelyntavarez on 3/20/15.
 */
import java.util.Scanner;
import java.util.Random;

public class twentyQuestions {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner scanner= new Scanner(System.in);
        int answer=random.nextInt(30000)+1;
        int attempts=0;

        System.out.println("Guess a number between 1 and 30,000 ");

        while (attempts < 20) {
            int guess = scanner.nextInt();
            if (guess > answer) {
                System.out.println("Your number is too high");
            } else if (guess < answer) {
                System.out.println("Your number is too low");
            } else {
                System.out.println("Your answer " + answer + " is the correct number! WOHOO!");
                return;
            }
        }

            attempts++;

            if (attempts>20){
                System.out.println("Game Over! You ran out of guesses :(");
            }
        }

    }


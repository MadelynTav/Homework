package nyc.c4q.madelyntav;

import java.util.Scanner;

public class Fibonacci {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number to see which Fibonacci sequence number it refers to: ");
            int wanted = input.nextInt();
            System.out.println(loop(wanted));
            }
        public static int rules(int number) {
            if (number==1||number==2){
                return 1;
            }
            return rules (number-1)+ rules (number-2);
        }

        public static int loop(int number){
            if (number==1){
                return 0;
            }
            if (number==2|| number==3){
                return 1;
            }
            int previousOne=1;
            int previousTwo=1;
            int result=1;

            for (int i=4; i<=number;i++){
                result= previousOne + previousTwo;
                previousOne=previousTwo;
                previousTwo=result;

            }
                    return result;

        }


}



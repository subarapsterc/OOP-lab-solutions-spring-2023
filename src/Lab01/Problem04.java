package Lab01;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        boolean play = true;
        Scanner scan = new Scanner(System.in);

        while (play) {
            int target = (int) (Math.random() * 100);

            boolean found = false;
            int numOfTries = 0;
            System.out.println(target);

            while (!found) {
                System.out.print("Enter your guess: ");
                int guess = scan.nextInt();
                numOfTries++;

                if (guess == target) {
                    found = true;
                    System.out.printf("You guessed right! It took you %d tries to find %d! %nWould you like to play again? (y/n) ", numOfTries, target);

                    String answer = scan.next();
                    if (answer.equals("n")) {
                        play = false;
                    }
                    else if (answer.equals("y")) {
                        play = true;
                    }
                }

                else if (guess < target) {
                    System.out.printf("The number lies above your guess. Try again.%n%n");
                }

                else if (guess > target) {
                    System.out.printf("The number lies below your guess. Try again.%n%n");
                }
            }

        }
    }
}

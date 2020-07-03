import java.util.Random;
import java.util.Scanner;

public class EnterRightNumber {
    public static void main(String[] args) {
        System.out.println("Please guess my number from 1 to 100 ");

//       Create a random number which is the number players have to guess
        int min = 1;
        int max = 100;
        Random randomNumber = new Random();
        int value = min + randomNumber.nextInt(max);

//      Create an object to store player inputs
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String playerName = input.nextLine();

        while (playerName == null || playerName.isEmpty()) {
            System.out.println("You have to enter your name to start the game");
            System.out.println("Enter your name:");
            String playerNameAttempt = input.nextLine();
            playerName = playerNameAttempt;
        }

        if (playerName != null && !playerName.isEmpty()) {
            System.out.println("Game start");
            int attemptCount = 1;
            while (attemptCount > 0) {
                System.out.println("Enter your number:");
                int numberInput = input.nextInt();

                if (value == numberInput) {
                    System.out.println("The number is correct. You have" + " " + attemptCount + " " + "attempt(s)." + "Well done," + " " + playerName + "!!!");
                    return;
                } else {
                    if (value >= numberInput) {
                        System.out.println("The number is higher. Try again!!!");
                    } else {
                        System.out.println("The number is less. Try again!!!");
                    }
                }
                attemptCount += 1;
            }
        }


    }
}

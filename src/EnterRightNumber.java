import java.util.Random;
import java.util.Scanner;

public class EnterRightNumber {
    public static void main(String[] args) {
        System.out.println("Please guess my number from 1 to 100 ");


//       Create a random number which is the number players have to guess
        int min = 1;
        int max = 100;
        Random randomNumber = new Random();
        int value = min + randomNumber.nextInt(max - min + 1);

//      Create an object to store player inputs
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String playerName = input.nextLine();

        while (playerName == null || playerName.isEmpty()) {
            System.out.println("You have to enter your name to start the game");
            System.out.println("Enter your name:");
            playerName = input.nextLine();
        }

        if (playerName != null && !playerName.isEmpty()) {
            System.out.println("Game start");

            System.out.println("Enter your number:");

            int attemptCount = 1;
            int numberInput = input.nextInt();

            while (value != numberInput) {
                if (value >= numberInput) {
                    System.out.println("The number is higher. Try again!!!");
                    numberInput = input.nextInt();
                } else if (value <= numberInput) {
                    System.out.println("The number is less. Try again!!!");
                    numberInput = input.nextInt();
                }
                attemptCount += 1;
            }

            if (value == numberInput) {
                System.out.println("The number is correct. You have" + " " + attemptCount + " " + "attempt(s)." + "Well done," + " " + playerName + "!!!");
                return;
            }
        }
    }
}


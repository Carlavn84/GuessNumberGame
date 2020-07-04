import java.util.Random;
import java.util.Scanner;

public class EnterRightNumber {

    private static int randomNumber(int min, int max) {
        Random randomNumber = new Random();
        int valueRandom = min + randomNumber.nextInt(max - min + 1);
        return valueRandom;

    }

    private static String getPlayerName() {
        System.out.println("Enter your name:");

        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();

        while (playerName == null || playerName.isEmpty()) {
            System.out.println("You have to enter your name to start the game:");
            playerName = input.nextLine();
        }

        if (playerName != null && !playerName.isEmpty()) {
            System.out.println("Game start");
            System.out.println("Enter your number:");
        }
        return playerName;
    }

    private static void guessNumber(String name) {
        Scanner input = new Scanner(System.in);

        int value = randomNumber(1, 100);
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
            System.out.println("The number is correct. You have" + " " + attemptCount + " " + "attempt(s)." + "Well done," + " " + name + "!!!");
            return;
        }
    }

    public static void main(String[] args) {
        System.out.println("Please guess my number from 1 to 100 ");

        String playerName = getPlayerName();

        guessNumber(playerName);
    }
}


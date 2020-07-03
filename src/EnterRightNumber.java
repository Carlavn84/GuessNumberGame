import java.util.Random;
import java.util.Scanner;

public class EnterRightNumber {
    public static void main(String[] args) {
        System.out.println("Please get my number from 1 to 100 ");

        int min = 1;
        int max = 100;
        Random randomNumber = new Random();
        int value = min + randomNumber.nextInt(max);

        Scanner input = new Scanner(System.in);

        int attemptCount = 1;
        while (attemptCount > 0) {
            System.out.println("Enter your number:");
            int numberInput = input.nextInt();

            if (value == numberInput) {
                System.out.println("The number is correct. You have" + " " + attemptCount + " " + "attempt(s)." + "Well done, dude!!!");
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

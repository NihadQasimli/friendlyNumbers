import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number1Dividing, number2, number2Dividing;


        while (true) {

            System.out.println("Please enter 2 different numbers. This program checks if the they are friendly numbers");
            System.out.println("You can enter a negative number to close the program.");

            number1 = scanner.nextInt();
            number1Dividing = 0;
            number2 = scanner.nextInt();
            number2Dividing = 0;


            if (number1 < 0 || number2 < 0) {
                System.exit(0);
            }

            if (number1 == number2) {
                System.out.println("The numbers cannot be equal to each other.");
                continue;
            }


            for (int i = 1; i < number1; i++) {
                if (number1 % i == 0) {
                    number1Dividing += i;
                }
            }
            for (int i = 1; i < number2; i++) {
                if (number2 % i == 0) {
                    number2Dividing += i;
                }
            }

            if (number1 == number2Dividing && number2 == number1Dividing) {
                System.out.println("These numbers are friendly numbers.");
                System.exit(0);
            } else {
                System.out.println("These numbers are not friendly numbers.");
            }

        }

    }
}


import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberCount = 0;
        int numberSum = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scan.nextLine());

            if (input == 0) {
                break;
            } else {
                numberCount += 1;
                numberSum += input;
            }
        }
        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Sum of the numbers: " + numberSum);
    }
}

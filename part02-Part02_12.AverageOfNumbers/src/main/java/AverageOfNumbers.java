
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberCount = 0;
        double averageNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scan.nextLine());

            if (input == 0) {
                break;
            } else {
                numberCount += 1;
                averageNumbers += input;
            }
        }
        System.out.println("Average of the numbers: " + (averageNumbers / numberCount));
    }
}

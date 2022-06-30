
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numbersCount = 0;
        double averageSum = 0;

        while (true) {
            double input = Integer.valueOf(scan.nextLine());

            if (input == 0) {
                break;
            } else if (input > 0) {
                numbersCount += 1;
                averageSum += input;
            }

        }

        if (averageSum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((averageSum / numbersCount));
        }
    }
}

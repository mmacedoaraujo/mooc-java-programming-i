
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numbersSum = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scan.nextLine());
            
            if (input == 0) {
                break;
            } else {
                numbersSum += input;
            }
        }
        
        System.out.println("Sum of the numbers: " + numbersSum);
    }
}

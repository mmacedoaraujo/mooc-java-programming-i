
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scan.nextLine());
            
            if (input == 0) {
                break;
            } else {
                numbers += 1;
            }
        }
        
        System.out.println("Number of numbers: " + numbers);
    }
}

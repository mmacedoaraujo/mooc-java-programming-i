
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = Integer.valueOf(scan.nextLine());
        int second = Integer.valueOf(scan.nextLine());
        
        double squareRoot = Math.sqrt(first + second);
        System.out.println(squareRoot);
    }
}

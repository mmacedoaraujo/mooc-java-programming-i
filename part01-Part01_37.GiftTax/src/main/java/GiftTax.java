
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        int exceed = 0;
        
        if (gift < 4999) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift <= 24999) {
            exceed = gift - 5000;
            System.out.println("Tax: " + (100 + (exceed * 0.08)));
        } else if (gift >= 25000 && gift <= 54999) {
            exceed = gift - 25000;
            System.out.println("Tax: " + (1700 + (exceed * 0.1)));
        } else if (gift >= 55000 && gift <= 199999) {
            exceed = gift - 55000;
            System.out.println("Tax: " + (4700 + (exceed * 0.12)));
        } else if (gift >= 200000 && gift < 999999) {
            exceed = gift - 200000;
            System.out.println("Tax: " + (22100 + (exceed * 0.15)));
        } else if (gift >= 1000000) {
            exceed = gift - 1000000;
            System.out.println("Tax: " + (142100 + (exceed * 0.17)));
        }
    }
}

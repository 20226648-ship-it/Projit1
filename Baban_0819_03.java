import java.util.*;
public class Baban_0819_03{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double sale, actual, profit;

        System.out.print("Enter the sale price: ");
        sale = input.nextInt();
        System.out.print("Enter the purchase price: ");
        actual = input.nextInt();

        profit = sale - actual;

        System.out.println("Your profit is " + profit + ".");
        System.out.println("Thank you for using this program.");

    }
}

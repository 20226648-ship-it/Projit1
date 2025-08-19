import java.util.*;
public class Baban_0819_01{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0, sum = 0,;

        System.out.print("Enter the first number:");
        num1 = input.nextInt();
        System.out.print("Enter the second number:");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + "."); 

    }
}
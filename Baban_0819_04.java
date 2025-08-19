import java.util.*;
public class Baban_0819_04{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num1, area, volume;

        System.out.print("Enter the edge: ");
        num1 = input.nextInt();

        area = 6*num1*num1;
        volume = num1*num1*num1;

        System.out.println("The surface area is " + area + " and the volume is " + volume +".");
    }
}
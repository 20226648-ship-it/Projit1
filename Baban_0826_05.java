import java.util.*;
public class Baban_0826_05{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double cel,fah;

        System.out.print("Enter the temperature in celcious: ");
        cel = input.nextInt();

        fah = (cel*(9/5.0))+32;
        System.out.print(+ cel + " degrees Celsious is equal to " + fah + " degrees Fahrenheit.");

    }
}
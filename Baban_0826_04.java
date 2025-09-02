import java.util.*;
public class Baban_0826_04{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int base,height,s1,s2,s3;
        double area,perimeter;
        System.out.print("Enter the base: ");
        base = input.nextInt();
        System.out.print("Enter the height: ");
        height = input.nextInt();
        area = 1/2.0*base*height;
        System.out.println("Area: " + area );

        System.out.print("Enter the first side: ");
        s1 = input.nextInt();
        System.out.print("Enter the second side: ");
        s2 = input.nextInt();
        System.out.print("Enter the third side: ");
        s3 = input.nextInt();
        perimeter = s1 + s2 + s3;
        System.out.print("Perimeter: " + perimeter );
    }
}
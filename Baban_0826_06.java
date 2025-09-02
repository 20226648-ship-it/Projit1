import java.util.*;
public class Baban_0826_06{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double chic,tchic,schic,egg,tegg;

        System.out.print("Enter number of chicken: ");
        chic = input.nextInt();

        schic = (chic*0.3);
        tchic = chic - schic;
        egg = tchic*3.0;
        tegg = egg*5.0;

        System.out.println("Chickens is " + chic + " after sold is " + schic +"." );
        System.out.println("Total chickens is " + tchic + "." );
        System.out.println("Eggs each days is " + egg + " so in 5 days it would be " + tegg +"." );
    
    }
}
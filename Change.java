import java.util.Scanner;

public class Change {
    public static void main(String[] args){
        double cost;
        double paid;
        double owed;

        double quarters = 25;
        double dimes = 10;
        double nickels = 5;
       

        double quartersOwed = 25;
        double dimesOwed = 10;
        double nickelsOwed = 5;
        double penniesOwed;
       

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Cost of the Item:");
        System.out.print(">");
        cost = scan.nextDouble();
        
        System.out.println("Please Enter the Amount Paid:");
        System.out.print(">");
        paid = scan.nextDouble();

        owed = paid - cost;
        owed = Math.round(owed * 100);
        System.out.println("Change Owed: " + owed/100);

        

        quartersOwed = (int)(owed / quarters);
        owed %= quarters;
        dimesOwed = (int)(owed / dimes);
        owed %= dimes;
        nickelsOwed = (int)(owed / nickels);
        owed %= nickels;

        
        penniesOwed = (int)owed;
       
        System.out.println("Quarters: " + (int)quartersOwed);
        System.out.println("Dimes: " + (int)dimesOwed);
        System.out.println("Nickels: " + (int)nickelsOwed);
        System.out.println("Pennies: " + (int)penniesOwed);

    }
}

import java.util.Scanner;

public class Percent {
    public static void main(String[] args){
        //intializations
        String name;
        double grade;
        int pointsBeforeFinal = 1500;
        int finalValue = 500;
        int pointsAfterFinal = pointsBeforeFinal + finalValue;
        double toKeepA;
        int toKeepAPercent;

        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.print(">");
        name = scan.nextLine();
        System.out.println("What is your current grade (in %)");
        System.out.print(">");
        grade = scan.nextDouble();

        //calculations
        
        toKeepA = ((0.9*pointsAfterFinal)-(grade/100*pointsBeforeFinal));
        toKeepAPercent = (int)((toKeepA/500)*100);
        System.out.println(name + ", you will need " + toKeepAPercent + "%" + " in the final to get an A");
    }
}
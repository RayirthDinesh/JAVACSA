import java.util.Scanner;

class Time
{
    //Name: Rayirth Dinesh           Period: 6
    public static void main (String[] args)
    {
        //varible intialization
        int input;
        int minutes;
        int hours;
        int days;
        int weeks;

        int secondsRemaining;
        int minutesRemaining;
        int hoursRemaining;
        int daysRemaining;
    
      
        Scanner scan = new Scanner(System.in);

        //User input
        System.out.println("Please enter the number of seconds.");
        System.out.print(">");
        input = scan.nextInt();

        //Calculations
        secondsRemaining = input % 60;
        minutes = input / 60; 
        minutesRemaining = minutes % 60;
    
        hours = minutes / 60;
        hoursRemaining = hours % 24;

        days = hours / 24;
        daysRemaining = days % 7;

        weeks = days / 7;
        

       //Output
       System.out.print(input + " seconds = "+ weeks + " weeks " + daysRemaining + " days " + hoursRemaining + " hours " + minutesRemaining + " minutes " + secondsRemaining + " seconds");


    }
}
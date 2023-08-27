import java.util.Scanner;
class Average
{
    public static void main(String[] args)
    {
        int testScore1;
        int testScore2;
        int quizScore1;
        int quizScore2;
        int quizScore3;
        double homeworkAverage;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your test grades.");
        System.out.print("Test Score 1 >");
        testScore1 = scan.nextInt();
        System.out.print("Test Score 2 >");
        testScore2 = scan.nextInt();

        System.out.println("\n Please enter your quiz grades.");
        System.out.print("Quiz Score 1 >");
        quizScore1 = scan.nextInt();
        System.out.print("Quiz Score 2 >");
        quizScore2 = scan.nextInt();
        System.out.print("Quiz Score 3 >");
        quizScore3 = scan.nextInt();

        System.out.println("\n Please enter your homework average.");
        System.out.print("Homework Average >");
        homeworkAverage = scan.nextDouble();

        double testAverage = ((double)testScore1 + (double)testScore2)/2;
        double quizAverage = ((double)quizScore1 + (double)quizScore2 + (double)quizScore3)/3;

        System.out.println("Test Average: " + testAverage);
        System.out.println("Quiz Score: " + quizAverage);
        System.out.println("Final Grade: " + (testAverage*0.5 + quizAverage*0.3 + homeworkAverage*0.2));




        
    }
}
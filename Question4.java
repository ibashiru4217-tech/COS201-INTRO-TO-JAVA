import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your continuous aassessment score: ");
        int score = input.nextInt();
        System.out.print("Enter your attendance percentage: ");
        double attendance = input.nextDouble();
        if (attendance >= 75) {
            if (score >= 40) {
                System.out.println("You are qualified to write the examination.");
            } else {
                System.out.println("You are not qualified. Your CA score is below 40.");
            }
        } else {
            System.out.println("You are not qualified. Your attendance is below 75%.");
        }
    }
}
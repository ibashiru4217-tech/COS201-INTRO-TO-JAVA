import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your examination score: ");
        int score = input.nextInt();
        String grade;
        if (score >= 70 && score <=100) {
            grade = "A";
        } else if (score >=60) {
            grade = "B";
        } else if (score >= 50) {
            grade = "C";
        } else if (score >= 45) {
            grade = "D";
        } else if (score >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }
        System.out.println("Your grade is: " + grade);
    }
}
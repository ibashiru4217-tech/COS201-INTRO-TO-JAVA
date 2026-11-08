import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your examination  score: ");
        int score = input.nextInt();
        if (score >= 50) {
            System.out.println("Congratulations!. You passed.");
        }
        input.close()
    }
}
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
        } else {
            int greater = (num1 > num2) ? num1 : num2;
            System.out.println("The greater number is: " + greater);
        }
    }
}
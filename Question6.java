import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Computer Science");
        System.out.println("2. Cyber Security");
        System.out.println("3' Software Engineering");
        System.out.println("4. Information Technology");
        System.out.print("Enter a number between 1 and 4: ");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Computer Science");
                break;
            case 2:
                System.out.println("Cyber Security");
                break;
            case 3:
                System.out.println("Software Engineering");
                break;
            case 4:
                System.out.println("Information Technology");
                break;
            default:
                System.out.println("Invalid selection.");
        }
    }
}
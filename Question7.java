import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = input.nextLine();
        System.out.print("Enter customer age: ");
        int age = input.nextInt();
        System.out.print("Enter monthly salary: ");
        double salary = input.nextDouble();
        if (age >= 21) {
            if (salary >= 100000.00) {
                System.out.println(name + ", you qualify for the loan.");
            } else {
                System.out.println(name + ", you do not qualify. Salary is below N100,000.00.");
            } 
        } else {
                System.out.println(name + ", you do not qualify. You must be at least 21 years old.");
        }
    }
}
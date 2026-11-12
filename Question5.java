public class Question5 {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 30;
        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
        } else {
            int highest = (num1 > num2) ? num1 : num2;
            System.out.println("The hihest number is: " + highest);
        }
    }
}
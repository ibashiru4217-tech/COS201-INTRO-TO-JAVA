public class Question7 {
    public static void main(String[] args) {
        String name = "Ibrahim Bashiru Musa";
        int age = 21;
        double salary = 150000;
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
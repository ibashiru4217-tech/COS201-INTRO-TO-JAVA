public class Question3 {
    public static void main(String[] args) {
      int score=67;
        String grade;
        if (score >= 70) {
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
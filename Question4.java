public class Question4 {
    public static void main(String[] args) {
       int attendance = 60;
       int score = 50;
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
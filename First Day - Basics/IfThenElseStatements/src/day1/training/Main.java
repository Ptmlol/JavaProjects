package day1.training;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score != 5000){
            System.out.println("Score is" + score);
            System.out.println("Score is" + score);
        }else if (score < 1000){
            System.out.println("Else happened. Score is " + score);
        }else{
            System.out.println("FK");
        }

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was"  + finalScore);
        }

        // int savedFinalScore = finalScore // cant acces out of scope vars
    }
}

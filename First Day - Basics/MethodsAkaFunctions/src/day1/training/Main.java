package day1.training;

public class Main {

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

	    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
	    int highScore2 = calculateScore(true, 500, 230, 9123);

        System.out.println("First HighScore " + highScore + "\nSecond HighScore " + highScore2);
    }
}

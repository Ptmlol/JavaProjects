package day1.training;

public class Main {

    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score){
        System.out.println("Score only" + score + " points");
        return score * 1000;
    }

    public static int calculateScore (){
        System.out.println("No player, no score");
        return -1;
    }

    public static void main(String[] args) {
	    int newScore = calculateScore("Tim", 100);
        System.out.println("New score is " + newScore);

        int scoreOnly = calculateScore(500);
        System.out.println("Score Only " + scoreOnly);

        System.out.println(calculateScore());
    }
}

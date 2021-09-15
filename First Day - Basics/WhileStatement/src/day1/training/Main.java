package day1.training;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("\n");
	    count = 1;
	    while(true){
	        if (count == 6){
                System.out.println("Break");
                break;
            }
            System.out.println("Count value is " + count);
	        count++;
        }
    }
}

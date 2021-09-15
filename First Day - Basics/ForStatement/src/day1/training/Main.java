package day1.training;

public class Main {

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){
        if (n == 1)
            return false;
        for (int i=2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

/*
        for (int i=0; i<5; i++){
            System.out.println("10,000 at 2% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
 */

        for (int i=1; i<20; i++) {
            if (isPrime(i)){
                System.out.println("Number " + i + " is prime");
            }else{
                System.out.println("Number " + i + " is not prime");
            }
        }
    }
}

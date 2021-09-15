package day2.training;

public class Main {

    public static void main(String[] args) {
//        Account bobsAccount = new Account("12345", 1.00, "Bob Brown", "email@bob.com", "0000000");
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(20.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(80.0);

        Vip person1 = new Vip();
        System.out.println(person1.getName());

        Vip person2 = new Vip("Bob", 25000.00);
        System.out.println(person2.getEmailAddress());

        Vip person3 = new Vip("Tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getCardLimit());
    }
}

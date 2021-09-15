package day2.training;

public class Vip {

    private String name;
    private double cardLimit;
    private String emailAddress;

    public Vip(String name, double cardLimit, String emailAddress) {
        this.name = name;
        this.cardLimit = cardLimit;
        this.emailAddress = emailAddress;
    }

    public Vip() {
        this("Default name", 1000.0, "vip@mail.com");
    }

    public Vip(String name, double cardLimit) {
        this(name, cardLimit, "mail@mail.com");
    }

    public String getName() {
        return name;
    }

    public double getCardLimit() {
        return cardLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

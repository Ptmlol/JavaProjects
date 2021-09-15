package day2.training;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        super.eat();
        System.out.println("Dog chew");
    }

    public void walk(int speed) {
        System.out.println("Dog walked");
        super.move(speed);
    }

    public void run(int speed){
        System.out.println("Dog ran");
        move(speed);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called at " + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        this.moveLegs(speed);
        super.move(speed);
    }
}

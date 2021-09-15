package day1.training;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("My string is = " + myString);
        myString = myString + ", yes we can concatenate with this";
        System.out.println(myString);
        myString = myString + " \u00A9 2021";
        System.out.println(myString);
        String numberString = "250.23";
        numberString = numberString + "443.2";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString); // int treated like a stirng
        double doubleNumber = 120.23d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is = " + lastString);
    }
}

package day1.training;

public class Main {

    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Val = " + myMinFloatValue);
        System.out.println("Float Max Val = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("\nDouble Min Val = " + myMinDoubleValue);
        System.out.println("Double Max Val = " + myMaxDoubleValue);

//        int myIntValue = 5;
//        float myFloatValue = (float) 5.25; // more used 5.25f <casting>
//        double myDoubleValue = 5.25d;

        int myIntValue = 5 / 3;
        float myFloatValue =  5f / 3f;
        double myDoubleValue = 5d / 3f; // or 5.00 / 3.00 instead of d

        System.out.println("\nMyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("\nConverted Kg = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_300_393.4_239_23d;
        System.out.println("\n" + pi);
        System.out.println(anotherNumber);

    }
}

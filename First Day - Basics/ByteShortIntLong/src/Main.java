public class Main {
    public static void main(String[] args){
        int myValue = 10000;
        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;
        System.out.println("Int Min = " + myMinInt);
        System.out.println("Int Max = " + myMaxInt);
        System.out.println("Overflow Max = " + (myMaxInt + 1));
        System.out.println("Overflow Min = " + (myMinInt - 1));
        int canWriteNrLikeThis = 2_34_23_53_2;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMinInt / 2);
        byte myByteTotal = (byte)(myMinByteValue / 2); // casting
        System.out.println(myByteTotal);

        short myShortTotal = (short)(myMaxShortValue / 2); // casting
        System.out.println(myShortTotal);

    }
}

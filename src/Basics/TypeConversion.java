package Basics;

public class TypeConversion {
    public static void main(String[] args) {
        // 1. automatic
        byte b1 = 10;
        int i1 = b1;
        System.out.println("Automatically converted higher to lower " + i1);

        // 2. explicit
        int i2 = 30;
        // byte b2 = i2; // this will give error, because int have range if more
        byte b3 = (byte) i2;
        System.out.println("explicitly converted lower to higher " + b3);

        // 3. Promotion
        byte b4 = 127;
        byte b5 = 1;

        int i3 = b4 + b5; // promotion to int, because it was getting out of range for byte
        System.out.println("promotion to int " + i3);

        int i4 = 10;
        double d1 = 20d;

        // int i5 = i4 + d1; // error

        double d2 = i4 + d1;
        System.out.println("higher should be picked " + d2);

    }
}

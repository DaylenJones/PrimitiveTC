public class PrimitiveTC {
    public static void main(String[] args) {
        byte myByte = 10;

        short myShort = 1000;

        int myInt = 50000;

        long myLong = 80000 - 5 * (myByte + myShort + myInt);

        System.out.println("Byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("Int value: " + myInt);
        System.out.println("Long value: " + myLong);


    }
}

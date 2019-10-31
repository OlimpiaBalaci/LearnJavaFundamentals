package intro_to_java1.primitive_types;

public class IntegerTypes {
    //byte  - 8  bits - 1 byte
    //short - 16 bits - 2 bytes
    //int   - 32 bits - 4 bytes
    //long  - 64 bits - 8 bytes

    public static void main(String[] args) {
        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Byte Min: " + Byte.MIN_VALUE);

        byte firstByte = 127;
        System.out.println(firstByte);

        System.out.println(firstByte + 129);//it will be converted to int
        System.out.println((byte) (firstByte + 129));//it will be converted to byte

        System.out.println("Short Max: " + Short.MAX_VALUE);
        System.out.println("Short Min: " + Short.MIN_VALUE);

        short myFirstShort = 16000;
        short myFirstShort1 = 32767;

        System.out.println(myFirstShort);
        System.out.println(myFirstShort*2);
        System.out.println((short)(myFirstShort*2));
        System.out.println(myFirstShort1+1);
        System.out.println((short)(myFirstShort1+1));
        System.out.println((short)(myFirstShort1+10));


        System.out.println("Int Max: " + Integer.MAX_VALUE);
        System.out.println("Int Min: " + Integer.MIN_VALUE);

        System.out.println("Long Max: " + Long.MAX_VALUE);
        System.out.println("Long Min: " + Long.MIN_VALUE);
    }
}

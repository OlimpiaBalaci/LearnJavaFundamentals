package intro_to_java1.variable_declaration;

public class IntegerDeclaration {

    public static void main(String[] args) {

        //In base 10: (0-9)
        int b10;

        b10 = 123;
        b10 = -564;
        b10 = 10_000_000;
        System.out.println(b10);

        //In base 8: (0-7)
        int b8;
        int bb;
        bb = 01234;
        b8 = 0123;
        b8 = -444;
        b8 = 01_00;
        b8 = 07;
        //b8=9; wrong
        System.out.println(b8);
        System.out.println(bb);

        //In base 16 (0-F) (Hexadecimal)
        int b16;
        b16 = 0x123;
        b16 = 0x55_99;
        b16 = -0xA54FF;
        b16 = 0xCAFEBABE;
        b16 = 0xDEAD_C0DE;
        //b16 = 0xDGHJ; wrong
        System.out.println(b16);

        //In base 2: (0 -1) (binary)
        int b2;

        b2 = 0b11001;
        b2 = 0B11001;
        b2=0b11_001;
        b2=-0b010110;
        //b2=0b2;
        System.out.println(b2);

    }

}

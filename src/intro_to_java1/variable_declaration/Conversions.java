package intro_to_java1.variable_declaration;

public class Conversions {
    public static void main(String[] args) {
        byte b = 120;
        short s = 15642;

        System.out.println((int) b);

        //We cannot convert short (16 bits)
        //to byte (8 bits)
        //b=s

        s = b;

        System.out.println(s);

        char c = 4;
        char c1 = '4';
        int i = 925566698;
        float f = i;

        System.out.println("print c " + c);
        System.out.println("print c1 " + c1);
        System.out.println("print i " + i);
        System.out.println("print f " + f);

        int i1 = 5, i2 = 3;

        System.out.println((float) i1 / i2);
    }
}

package intro_to_java1.variable_declaration;

public class FloatingPointDeclaration {
    public static void main(String[] args) {
        float f;

        f = 123.43f;
        System.out.println(f);

        f = 123.4F;
        System.out.println(f);

        f = -85.33f;
        System.out.println(f);

        f = 77.0f;
        System.out.println(f);

        f = 77f;
        System.out.println(f);

        double d;

        d = 123.45d;
        d = 123.45D;
        d = 123.45;//d is redundant
        d = 123;//d is redundant
        System.out.println(d);

        //Scientific notation
        double thousand;
        thousand = 1e+3;
        thousand = 1e3;
        System.out.println(thousand);
    }
}

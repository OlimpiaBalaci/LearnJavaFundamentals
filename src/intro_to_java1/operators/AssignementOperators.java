package intro_to_java1.operators;

public class AssignementOperators {
    public static void main(String[] args) {
        int a = 1, b = 1;

        a = b = 1;
        System.out.println(a);
        System.out.println(b);

        a = a + 2;
        System.out.println(a);

        a += 2;
        System.out.println(a);

        a -= 1;//a = a - 1;
        System.out.println(a);

        a *= 3;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        //The rest of the divisio
        b = a % 5;
        System.out.println(b);
        System.out.println(a % 5);

    }
}

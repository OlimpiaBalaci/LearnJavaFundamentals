package intro_to_java1.operators;

public class LogicalOperators {
    public static void main(String[] args) {

        int a = 6, b = 5;

        //&& AND

        System.out.println(a==4 && b==5);

        // || OR
        System.out.println(a%2 ==0 || b%2 ==0);

        //! Negation
        System.out.println(!(a%2==0));//even
        System.out.println(a%2 !=0);//odd
        System.out.println(! (a==4 && b==5));

    }
}

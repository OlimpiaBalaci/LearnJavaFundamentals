package intro_to_java1.variable_declaration;

public class StringDeclaration {
    public static void main(String[] args) {
        String s = "Learning Java is fun!";
        System.out.println(s);

        //backspace
        System.out.println("Hello\b");

        //carriage return
        System.out.println("Learning \njava is fun!");
        System.out.println("Learning java \r is fun!");

        //String concatenation
        System.out.println("Java " + "Is Fun!");
        System.out.println("Your number is: " + 3.14f);

        //Numeric operations
        System.out.println("Sum: " + 1  + 2);
        System.out.println(("Sum: 1") + 2);
        System.out.println("Sum: 12");

        System.out.println("Sum: " +( 1  + 2));
        System.out.println("Sum: " + (3));


    }
}

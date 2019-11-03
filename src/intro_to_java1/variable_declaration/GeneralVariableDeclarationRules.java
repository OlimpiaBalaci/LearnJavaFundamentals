package intro_to_java1.variable_declaration;

import static java.lang.System.out;

public class GeneralVariableDeclarationRules {
    //A variable name must BEGIN with a letter and must be
    // a sequence of letters or digits.

    //A letter is defined as 'A'–'Z', 'a'–'z', '_', '$'
    //or any Unicode character that denotes a letter in a language.

    //Similarly, digits are '0'–'9' and any Unicode characters
    // that denote a digit in a language.

    //The first letter SHOULD be lowercase, and then normal
    //FirstString - Pascal Case
    //firstString - Camel Case
    //CamelCase rules should be used.

    //All characters in the name of a variable
    //are significant and case is also significant.
    public static void main(String[] args) {

        //Variable declaration - overview
        int a;                  //declaration
        a = 10;                 //initialization
        out.println(a);  //print

        int b = 20; // declaration with initialization

        //multiple declaration
        int x, y = 10, z;

        //If we don't initialize a variable it will get the default value: zero

        int defaultValue;
        //out.println(defaultValue);

        //the right way
        int test = 0;
        out.println(test);
        //out.println(test); it requires to initialize test


    }
}

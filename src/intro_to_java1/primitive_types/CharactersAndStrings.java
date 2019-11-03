package intro_to_java1.primitive_types;

public class CharactersAndStrings {
    //char - 16 bits - 2 bytes

    public static void main(String[] args) {
        char firstChar ='4';
        System.out.println(firstChar);
        System.out.println("*****Char Maximum Numeric Values*****");
        System.out.println("Char MAX: " + (Character.MAX_VALUE + 0));
        System.out.println("Char MIN: " + (Character.MIN_VALUE + 0));

        System.out.println("*****Char Maximum Character Values*****");
        System.out.println("Char MAX: " + Character.MAX_VALUE );
        System.out.println("Char MIN: " + Character.MIN_VALUE );
    }
}

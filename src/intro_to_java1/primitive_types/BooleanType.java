package intro_to_java1.primitive_types;

public class BooleanType {
    //boolean - 1 bit
    public static void main(String[] args) {
        //every variable has a type and a name, followed by  ;
        boolean firstBoolean;//this is called a declaration
        firstBoolean = true;//this is called assigning the value true to firstBoolean
        System.out.println(firstBoolean);

        firstBoolean = false;
        System.out.println(firstBoolean);

        boolean hasChildren = false; //declaration and assignement in a single line
        System.out.println(hasChildren);
    }
}

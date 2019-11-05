package intro_to_java1.operators;

public class IfInstruction {
    public static void main(String[] args) {
        boolean booleanExpression = true;

        //Simple if
        if (booleanExpression) {
            //statement or block of code
        }

        //if-else
        if (booleanExpression) {
            //statement or block of code
        } else {
            //statement or block of code
        }

        //Chain conditions

        if (booleanExpression) {
            //statement or block of code

        } else if (booleanExpression) {
            //statement or block of code

        } else {
            //statement or block of code
        }
    }
}
package intro_to_java1.primitive_types;

public class FloatingPointPrecision {
    public static void main(String[] args)
    {
        //Floating point precision at 6 decimal
        float firstFloat = 1.111111111111111f;
        System.out.println("Float number : " + (firstFloat + firstFloat));

        //Double precision 15 decimals
        double firstDouble = 1.1111111111111111;
        System.out.println("Double number : " + (firstDouble + firstDouble));

        /*result is
        Float number : 2.2222223
        Double number : 2.2222222222222223
        */
    }
}

package intro_to_java1.arrays;

public class Arrays {
    public static void main(String[] args) {
        //declares and allocates memory for array1
        int[] array1 = new int[10];

        //declares, allocates and initializes memory for array2
        int[] array2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = array2[2];

        //declares an array of integers
        int[] firstArray;

        //allocate memory for 5 integers
        firstArray = new int[5];

        //initialize first element
        firstArray[0] = 0;

        //initialize second element
        firstArray[1] = 1;
        firstArray[2] = 2;
        System.out.println("x is " + x);
        System.out.println();
        System.out.println("Element at index 0: "
                + firstArray[0]);
        System.out.println("Element at index 1: "
                + firstArray[1]);
    }
}

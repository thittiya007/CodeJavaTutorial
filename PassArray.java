import java.util.*;
public class PassArray {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        int [] numbers = new int[ARRAY_SIZE];
        getValues(numbers);
        System.out.println("Her are the number the you enterd : ");
        showArray(numbers);
    }
    public static void getValues(int[] array) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter aseries of "+array.length+"number.");
        for(int index = 0; index < array.length; index++){
            System.out.println("Enter Number "+(index +1)+ ": ");
            array[index] = in.nextInt();
        }
    }
    public static void showArray(int[] array) {
        for(int index=0; index < array.length;index++){
            System.out.println(array[index]+" ");
        }
    }
}
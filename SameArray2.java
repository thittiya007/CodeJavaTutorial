public class SameArray2 {
    public static void main(String[] args) {
       int [] array1 = {5, 4, 3, 2, 1};
       int [] array2 = new int[array1.length];
       for(int i = 0; i < array1.length; i++){
           array2[i] = array1[i];
       }
       System.out.println("array1");
       for(int i = 0; i < array1.length; i++){
           System.out.println(array1[i]+" ");
       }
       System.out.println("array2");
       for(int i = 0; i < array2.length; i++){
           System.out.println(array1[i]+" ");
       }
    }   
   }
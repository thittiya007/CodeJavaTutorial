public class Result1To100 {
    public static void main(String[] args) {
        int Result = 1 ,sum = 0;
        while(Result <= 100){
            System.out.println("Result"+Result);
            Result++;
            sum += Result;
        }
        System.out.println("result : "+sum);
    }
}
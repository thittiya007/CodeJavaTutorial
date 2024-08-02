import java.util.Scanner;

public class PrimeChcker {
    public static void main(String[] args) {
        int number;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What number would you like to test? ");
        number = input.nextInt();
        if(isPrime(number)){
            System.out.println(number+" is a prime number.");
        }
        else{
            System.out.println(" is not prime.");
        }
    }
    public static boolean isPrime(int p) {
        if(p <= 1){
            return false;
        }
        else if(p ==2){
            return true;
        }
            for(int i = 3; i < p; i += 2){
                if(p % i == 0){
                    return false;
                }else{

                }
            }
        return true;
    }
}
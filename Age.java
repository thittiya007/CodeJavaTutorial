import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        final int Age =20;
        int inputAge ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        inputAge = scan.nextInt();
        System.err.println("your entered : "+inputAge);
        if(inputAge < 20)
            System.err.println("your are still young");
        System.err.println("Good Bye");
    }
}
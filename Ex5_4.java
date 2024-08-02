import java.util.Scanner;

public class Ex5_4 {
        public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even numbers";
        } else {
            return "odd number";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int inputNumber = scanner.nextInt();
        String result = checkEvenOdd(inputNumber);
        System.out.println("number " + inputNumber + " is " + result);
        scanner.close();
    }
}
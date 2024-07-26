import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
    String name;
    int hours;
    double payRate;
    double grossPay;
    Scanner Keyboard = new Scanner(System.in);
    System.out.print("What is your name? ");
    name = Keyboard.nextLine();
    System.out.print("How many hours did you work thisn week?");
    hours = Keyboard.nextInt();
    System.out.print("What is your hourly pay rate? ");
    payRate = Keyboard.nextDouble();
    grossPay = hours * payRate;
    System.out.println("Hello " + name);
    System.out.println("Your gross pay is " + grossPay);
    }
}
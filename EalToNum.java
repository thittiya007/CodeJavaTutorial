import java.util.Scanner;
public class EalToNum {
    public static void main(String[] args) {
        int number;
        Scanner num = new Scanner(System.in);
        System.out.println("1.+");
        System.out.println("2.*");
        System.out.println("3./");
        System.out.println("4.-");
        System.out.print("Enter 1,2,3,or 4 : ");
        number = num.nextInt();
        switch(number){
            case 1 :
            int num1,num2,sum;
            System.out.print("number: ");
            num1 = num.nextInt();
            System.out.print("number: ");
            num2 = num.nextInt();
            sum = num1 + num2;
            System.out.println( num1 + " + " + num2 + " = " + sum);
            break;
            case 2 :
            int num3,num4,sum2;
            System.out.print("number: ");
            num3 = num.nextInt();
            System.out.print("number: ");
            num4 = num.nextInt();
            sum2 = num3 * num4;
            System.out.println( num3 + " * " + num4 + " = " + sum2);
            break;
            case 3 :
            int num5,num6,sum3;
            System.out.print("number: ");
            num5 = num.nextInt();
            System.out.print("number: ");
            num6 = num.nextInt();
            sum3 = num5 / num6;
            System.out.println( num5 + " / " + num6 + " = " + sum3);
            break;
            case 4 :
            int num7,num8,sum4;
            System.out.print("number: ");
            num7 = num.nextInt();
            System.out.print("number: ");
            num8 = num.nextInt();
            sum4 = num7 - num8;
            System.out.println( num7 + " - " + num8 + " = " + sum4);
            break;
            default :
            System.out.println("that's not 1,2,3 or 4");
            break;
        }
    }
}

public class Ex5_3 {
    public static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 12;
        int max = findMax(number1, number2);
        System.out.println("Maximum value between " + number1 + " and " + number2 + " is " + max);
    }
}
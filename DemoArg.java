public class DemoArg {
    public static void main(String[] args) {
        System.out.println("Start in main.");
        int testnum = 10,total;
        displayValue(5);
        displayValue(testnum);
        displayValue(testnum * 5);
        showSum(3,4);
        total = showSum(3,4);
        System.out.println("total have value :" +total);
    }
    public static void displayValue(int num) {
        System.out.println("Value is" +num);
    }
    public static int showSum(int x, int y) {
        int sum;
        sum = x+y;
        return sum;
    }
}
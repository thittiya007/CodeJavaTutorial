public class Ex5_1 {
    public static double calculateTriangleArea(double base, double height) {
        double area = 0.5 * base * height;
        return area;
    }

    public static void main(String[] args) {
        double base = 10.0;   
        double height = 5.0; 
        double area = calculateTriangleArea(base, height);
        System.out.println("The ground of the triangle with the base " + base + " and height " + height + " is " + area);
    }
}
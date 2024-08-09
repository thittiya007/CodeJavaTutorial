public class LengthDemo {
    public static void main(String[] args) {
    Rectangle box = new Rectangle();
    System.out.println("Seding the vaue 10.0 the setLength method");
    box.setLength(10.0);
    box.setWidth(20.0);
    System.out.println("The box's length is "+box.getLength());
    System.out.println("The box's Width is "+box.getWidth());
    System.out.println("The box's area is "+box.getArea());
    System.out.println("Done");
    }   
}
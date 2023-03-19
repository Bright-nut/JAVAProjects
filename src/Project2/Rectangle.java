package Project2;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
   public double printArea(){
        double area = width*height;
       System.out.println("Area is ");
        return area;
   }
}

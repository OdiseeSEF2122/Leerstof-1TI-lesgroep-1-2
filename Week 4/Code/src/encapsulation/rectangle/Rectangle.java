package encapsulation.rectangle;

public class Rectangle {

    private double length;
    private double width;
    private double area;

    public Rectangle(final double width, final double length){
        this.length = length;
        this.width = width;
        area = this.length * this.width;
    }

    public double getArea(){
        return area;
    }

    public void setLength(double length){
        this.length = length;
        area = length * width;
    }
}

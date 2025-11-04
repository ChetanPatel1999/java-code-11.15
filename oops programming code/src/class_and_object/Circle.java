package class_and_object;

public class Circle {

    public double radius;
    public double area;
    public double circumference;

    public void setRadius(double r) {
        radius = r;
    }

    public void calculateArea() {
        area = 3.141 * radius * radius;
    }

    public void getArea() {
        System.out.println("area of circle which radius " + radius + " = " + area);
    }

    public void calculateCircumference() {
        circumference = 2 * 3.141 * radius;
    }

    public void getCercumference() {
        System.out.println("circumference of circle which radius " + radius + " = " + circumference);
    }
}

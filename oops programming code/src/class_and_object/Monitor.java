package class_and_object;

public class Monitor {

    private String cName; //data member
    private int price;
    private String color;
    private float rating;

    public Monitor(String cName, int price) {
        this.cName = cName;
        this.price = price;
    }

    public Monitor(String cName, int price, String color, float rating) {
        this.cName = cName;
        this.price = price;
        this.color = color;
        this.rating = rating;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getcName() {
        return cName;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public float getRating() {
        return rating;
    }
    
    public void getMonitor() {

        System.out.println("Monitor info :- ");
        System.out.println("monitor name : " + cName);
        System.out.println("monitor price : " + price);
        System.out.println("monitor color : " + color);
        System.out.println("monitor rating : " + rating);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Monitor m1 = new Monitor("HP", 120, "red", 3.5f);
        m1.getMonitor();
        System.out.println(m1.getPrice());
    }
}

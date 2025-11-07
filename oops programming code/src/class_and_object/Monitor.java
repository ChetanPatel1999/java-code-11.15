package class_and_object;

public class Monitor {

    private String cName; //data member
    private int price;
    private String color;
    private float rating;

    public void setMonitor(String s, int p, String c, float r)// methods 
    {

        cName = s;
        price = p;
        color = c;
        rating = r;
    }

    public void getMonitor() {
        
        System.out.println("Monitor info :- ");
        System.out.println("monitor name : " + cName);
        System.out.println("monitor price : " + price);
        System.out.println("monitor color : " + color);
        System.out.println("monitor rating : " + rating);
        System.out.println("-----------------------------");
    }
}

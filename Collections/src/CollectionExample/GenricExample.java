package CollectionExample;

class Demo<T1,T2> {

    T1 data1;
    T2 data2;

    Demo(T1 data1, T2 data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    void display() {
        System.out.println("data display : ");
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
    }
}

public class GenricExample {

    public static void main(String[] args) {
        Demo<Integer,Integer> d1 = new Demo<Integer,Integer>(45, 90);
        d1.display();

        Demo<Double,String> d2 = new Demo<Double,String>(45.44, "hello");
        d2.display();

        Demo<String,String> d3 = new Demo<String,String>("car", "yogesh");
        d3.display();

        Demo<Character,Double> d4 = new Demo<Character,Double>('A', 45.89);
        d4.display();

    }
}

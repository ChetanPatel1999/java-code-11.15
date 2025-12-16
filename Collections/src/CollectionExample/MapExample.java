package CollectionExample;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {
        // inside map we can store data in key: value pair
        HashMap<Integer, String> student = new HashMap<Integer, String>();
        student.put(101, "yogesh");
        student.put(102, "gourav");
        student.put(103, "pawan");
//      System.out.println(student);
//        String name = student.get(101);
//        System.out.println(name);
        student.replace(102, "chetan");
        student.remove(103);
        System.out.println(student);
    }

}

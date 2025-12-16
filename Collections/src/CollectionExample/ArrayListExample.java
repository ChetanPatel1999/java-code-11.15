package CollectionExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListExample {

    public static void main(String[] args) {
          HashSet<String> cities = new HashSet<String>();
//        ArrayList<String> cities = new ArrayList<String>();
//        LinkedList<String> cities = new LinkedList<String>();
//        TreeSet<String> cities = new TreeSet<String>();
//        LinkedHashSet<String> cities = new LinkedHashSet<String>();
        cities.add("indore");
        cities.add("ujjain");
        cities.add("ratlam");
        cities.add("Mhow");
        cities.add("bhopal");
        cities.add("indore");
        System.out.println(cities);
        for (String city : cities) {
            System.out.println(city);
        }
    }

}

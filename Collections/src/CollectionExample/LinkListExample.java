package CollectionExample;

import java.util.LinkedList;

public class LinkListExample {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add("ujjain");
        l1.add("indore");
        l1.add("ratlam");
        l1.add("bhopal");
        l1.addFirst("mhow");
        l1.add(2, "dhar");
        System.out.println(l1);//[mhow, ujjain, dhar, indore, ratlam, bhopal]
//        l1.remove();
//        l1.removeLast();
//        l1.remove("ratlam");
        l1.remove(3);
        System.out.println(l1);
    }
}

package class_and_object;

public class NumberUser {
    
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.setNumber(12, 8);
        n2.setNumber(10, 15);
        n1.getNumber();
        n2.getNumber();
        n1.addition();
        n2.addition();
        System.out.println("------------------");
//        n1.additionDifferentObject(n2);
        n2.additionDifferentObject(n1);
        Number.additionDifferentObj(n1, n2);
    }
    
}

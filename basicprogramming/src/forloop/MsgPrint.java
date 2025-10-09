package forloop;

public class MsgPrint {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println("hello wolrd institute");
            System.out.println(i);
        }
        System.out.println(i);//6
        {
            int age = 12;
            System.out.println(i);  //6
            System.out.println(age);  //6
            {
                System.out.println(age);
            }
        }
    }

//    System.out.println (age); //show error
}


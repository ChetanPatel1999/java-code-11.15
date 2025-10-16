package pattern;

public class Pattern {

    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) //3
//        {
//            for (int j = 1; j <= 3; j++) //2
//            {
//                System.out.println("hello students");
//            }
//            System.out.println("----------------");
//        }
//        for (int i = 1; i <= 5; i++) //3
//        {
//            for (int j = 1; j <= 5; j++) //2
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 5; i++) //2
//        {
//            for (int j = 1; j <= 5; j++) //2
//            {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) //3
//        {
//            for (int j = i; j <= 5; j++) //2
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        int row = 8;
//        for (int i = 1; i <= 5; i++) //2
//        {
//            for (int j = i; j <= 5; j++) //2
//            {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 65; i <= 69; i++) //65
//        {
//            for (int j = 65; j <= i; j++) //2
//            {
//                System.out.print((char) j + " ");
//            }
//            System.out.println();
//        }
//        for (char i = 'A'; i <= 'E'; i++) //65
//        {
//            for (char j = 'A'; j <= 'E'; j++) //2 j=j+1
//            {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= 5; i++) //65
        {
            for (int j = 1; j <=i; j++) //2
            {
                if(j%2==0)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }

    }
}

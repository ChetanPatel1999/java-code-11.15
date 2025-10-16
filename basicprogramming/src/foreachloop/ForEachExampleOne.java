package foreachloop;

public class ForEachExampleOne {

    public static void main(String[] args) {
        int arr[] = {12, 34, 56, 78, 90, 5, 10};
//        for (int i = 0; i < 5; i++) //1
//        {
//            System.out.println(arr[i]);
//        }

//        for (int val : arr) {
//            System.out.println(val);
//        }
        int sum = 0;
        for (int val : arr) {
            sum = sum + val;
        }
        System.out.println(sum);
    }
}

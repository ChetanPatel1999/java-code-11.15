package lablingofloops;

public class LablingLoopsExampleOne {

    public static void main(String[] args) {
        outerforloop:
        for (int i = 1; i <= 5; i++) //1
        {
            innerforloop:
            for (int j = 1; j <= 5; j++) //3
            {
                if (j == 3) {
                    break outerforloop;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

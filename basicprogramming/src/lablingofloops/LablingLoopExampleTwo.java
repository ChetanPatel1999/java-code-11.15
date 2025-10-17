package lablingofloops;

public class LablingLoopExampleTwo {

    public static void main(String[] args) {
        outerforloop:
        for (int i = 1; i <= 5; i++) //3
        {
            innerforloop:
            for (int j = 1; j <= 5; j++) //3
            {
                if (i == 3) {
                    continue outerforloop;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

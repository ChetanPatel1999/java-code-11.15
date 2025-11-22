package mypkg;

public class MediStud extends Student {

    private int prof;
    private String speci;

    public void setMediStud(int prof, String speci) {
        this.prof = prof;
        this.speci = speci;

    }

    public void getMediStud() {
        System.out.println("prof : " + prof);
        System.out.println("speci : " + speci);
    }

    public void result(int per) {
        if (per >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("Fail");
        }
    }
}

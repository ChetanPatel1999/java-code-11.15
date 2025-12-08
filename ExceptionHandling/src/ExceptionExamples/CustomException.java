package ExceptionExamples;

class Emp extends Throwable {

    int id;

    public void setEmp(int id) {
        this.id = id;
    }

    public void getEmp() {
        System.out.println("emp id : " + id);
    }
}

public class CustomException {

    public static void main(String[] args) {
        int id = 101;
        Emp e1 = new Emp();

        try {
            if (id < 0) {
                throw e1;
            }
            e1.setEmp(id);
        } catch (Emp e) {
            System.out.println("nagative id not allowed");
            e.setEmp(1);
        }
        e1.getEmp();
    }
}

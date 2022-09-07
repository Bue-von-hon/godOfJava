public class ManageStudent1 {

    public static void main(String[] args) {
        ManageStudent1 main = new ManageStudent1();
        main.checkEquals();
    }
    public void checkEquals() {
        Student1 a = new Student1("Jung", "Seoul", "01012345678", "a@a.com");
        Student1 b = new Student1("Jung", "Seoul", "01012345678", "a@a.com");

        boolean comp = a.equals(b);
        if (comp) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

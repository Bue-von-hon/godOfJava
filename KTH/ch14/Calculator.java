public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        try {
            c.printDivide(1, 2);
            c.printDivide(1, 0);
        }
        catch (myException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void printDivide(double d1, double d2) throws myException {
        if (d2 == 0) throw new myException("error");
        double ret = d1/d2;
        System.out.println(ret);
    }
}

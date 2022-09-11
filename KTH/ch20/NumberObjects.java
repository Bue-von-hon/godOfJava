public class NumberObjects {
    public long parseLong(String data) throws Exception {
        try {
            long num = Long.parseLong(data);
            return num;
        }
        catch (Exception e) {
            throw new Exception(e.getMessage()+" error");
        }
    }

    public void printOtherBase(long value) {
        String Bi = Long.toBinaryString(value);
        String Hex = Long.toHexString(value);
        String Oct = Long.toOctalString(value);
        System.out.println("original : "+value);
        System.out.println(Bi);
        System.out.println(Hex);
        System.out.println(Oct);
    }

    public static void main(String[] args) {
        NumberObjects obj = new NumberObjects();
        try {
            long num = obj.parseLong("r1024");
            System.out.println(num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        obj.printOtherBase(1024);
    }
}

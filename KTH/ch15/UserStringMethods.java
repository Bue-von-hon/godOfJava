public class UserStringMethods {
    public void printWords(String str) {
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    public void findString(String str, String findStr) {
        int i = str.indexOf(findStr);
        System.out.println(i);
    }
    public static void main(String[] args) {
        UserStringMethods a = new UserStringMethods();
        String s = "The String class represents characher strings";
        a.printWords(s);
        a.findString(s, "string");
    }
}

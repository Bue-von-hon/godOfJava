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
    public void findAnyCaseString(String str, String findstr) {
        int i = str.toLowerCase().indexOf(findstr.toLowerCase());
        System.out.println(i);
    }
    public void countChar(String str, char c) {
        char[] chars = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) cnt++;
        }
        System.out.println(cnt);
    }
    public void printContainWords(String str, String findStr) {
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].contains(findStr)) System.out.println(s[i]);
        }
    }
    public static void main(String[] args) {
        UserStringMethods a = new UserStringMethods();
        String s = "The String class represents characher strings";
        a.printWords(s);
        a.findString(s, "string");
        a.findAnyCaseString(s, "string");
        a.countChar(s, 's');
        a.printContainWords(s, "ss");
    }
}

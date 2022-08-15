package test.ttestt.JTW.ch7;

public class J_ManageHeight {
    public int[][] gradeHeights;

    public static void main(String[] args) {
        J_ManageHeight main = new J_ManageHeight();
        main.J_setData();
        for (int i = 0; i < 5; i++) {
            System.out.println("Class No. : " + (i+1));
//            main.J_printHeight(i);
            main.J_printAverage(i);
        }
    }

    public void J_setData() {
        gradeHeights = new int[5][];
        gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
        gradeHeights[1] = new int[] {160, 165, 167, 186};
        gradeHeights[2] = new int[] {158, 177, 187, 176};
        gradeHeights[3] = new int[] {173, 182, 181};
        gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
    }

    public void J_printHeight(int classNo) {
        for (int a : gradeHeights[classNo]) {
            System.out.println(a);
        }
    }

    public void J_printAverage(int classNo) {
        double result = 0;
        for (int a : gradeHeights[classNo]) {
            result += a;
        }
        System.out.println("Height average:" + result/ gradeHeights[classNo].length);
    }
}

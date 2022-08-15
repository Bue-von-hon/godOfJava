public class ManageHeight {
    int gradeHeight[][];
    public void setData() {
        gradeHeight = new int[5][];
        gradeHeight[0] = new int[] {170, 180, 173, 175, 177};
        gradeHeight[1] = new int[] {160, 165, 167, 186};
        gradeHeight[2] = new int[] { 158, 177, 187, 176 };
        gradeHeight[3] = new int[] { 173, 182, 181 };
        gradeHeight[4] = new int[] { 170, 180, 165, 177, 172 };
    }
    public void printHeight(int classNo) {
        for (int i = 0; i < gradeHeight[classNo].length; i++) {
            System.out.println(gradeHeight[classNo][i]);
        }
    }
    public void printAvg(int classNo) {
        double sum = 0;
        for (int i = 0; i < gradeHeight[classNo].length; i++) {
            sum += gradeHeight[classNo][i];
        }

        System.out.println(sum/gradeHeight[classNo].length);
    }
    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for (int i = 0; i < 5; i++) {
            //manageHeight.printHeight(i);
        }

        manageHeight.printAvg(0);

    }
}

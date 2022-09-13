public class MaxFinder {
    public void testGetMax() {
        System.out.println(getMax(1, 2, 3));
        System.out.println(getMax(3, 1, 2));
        System.out.println(getMax(2, 3, 1));
        System.out.println(getMax("a", "b", "c"));
    }

    public void testGetMin() {
        System.out.println(getMin(1, 2, 3));
        System.out.println(getMin(3, 1, 2));
        System.out.println(getMin(2, 3, 1));
        System.out.println(getMin("a", "b", "c"));
    }

    private <T extends Comparable> T getMax(T ... a) {
        T maxT=a[0];
        for (T tmpT:a) {
            if (tmpT.compareTo(maxT)>0)maxT=tmpT;
        }
        return maxT;
    }

    private <T extends Comparable> T getMin(T ... a) {
        T minT=a[0];
        for (T tmpT:a) {
            if (tmpT.compareTo(minT)<0)minT=tmpT;
        }
        return minT;
    }

    public static void main(String[] args) {
        MaxFinder a = new MaxFinder();
        a.testGetMin();
    }
}

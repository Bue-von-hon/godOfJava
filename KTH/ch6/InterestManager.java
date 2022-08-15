public class InterestManager {
    public double getInterestRate(int day) {
        if (day < 90) return 0.005;
        else if (day < 180) return 0.01;
        else if (day < 364) return 0.02;
        else return 0.056;
    }
    public double calcurateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);
        return amount+amount*interestRate;
    }
    public static void main(String[] args) {
        InterestManager manager = new InterestManager();
        for (int i = 1; i <= 365; i++) {
            System.out.println(manager.calcurateAmount(i, 100));
        }
        for (int i = 1; i <= 365; i+=10) {
            System.out.println(manager.calcurateAmount(i, 100));
        }
    }
}

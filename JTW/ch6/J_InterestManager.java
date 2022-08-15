package test.ttestt.JTW.ch6;

public class J_InterestManager {
    public static void main(String[] args) {
        J_InterestManager main = new J_InterestManager();
        for (int day = 1; day <= 365; day++) {
            System.out.println(main.J_calculateAmount(day, 1000000));
        }
    }

    public double J_getInterestRate(int day) {
        if (day <= 90) {
            return 0.5;
        } else if (day <= 180) {
            return 1;
        } else if (day <= 364) {
            return 2;
        }
        return 5.6;
    }

    public double J_calculateAmount(int day, long amount) {
        double rate = J_getInterestRate(day);
        return rate * amount;
    }
}

public class T_InterestManager {
    public static void main(String[] args) {
        T_InterestManager main = new T_InterestManager();
        for (int day = 1; day <= 365; day++) {
            System.out.println(main.T_calculateAmount(day, 1000000));
        }
    }

    public double T_getInterestRate(int day) {
        if (day <= 90) {
            return 0.5;
        } else if (day <= 180) {
            return 1;
        } else if (day <= 364) {
            return 2;
        }
        return 5.6;
    }

    public double T_calculateAmount(int day, long amount) {
        double rate = T_getInterestRate(day);
        return rate * amount;
    }
}

import java.util.Date;

public class TimerThread extends Thread{
    @Override
    public void run() {
        try {
            printCurrenTime();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printCurrenTime() throws InterruptedException {
        int idx = 0;
        while (true) {
            if (idx == 10) break;
            Date date = new Date();
            String s = date.toString();
            long l = System.currentTimeMillis();
            System.out.println(s+" "+Long.toString(l));
            sleep(1000);
            idx++;
        }
        return;
    }
}

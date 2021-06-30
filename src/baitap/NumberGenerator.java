package baitap;

public class NumberGenerator implements Runnable{
    private String threadName;

    public NumberGenerator(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
try {
    for (int i=0;i<10;i++){
        System.out.println("in ra số "+i);
Thread.sleep(500);
    }
} catch (InterruptedException e) {
    e.printStackTrace();
}
    }
}

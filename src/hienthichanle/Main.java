package hienthichanle;

public class Main {
    public static void main(String[] args) {
        OddThread ahi=new OddThread();
        EvenThread ahi1=new EvenThread();
        Thread thread=new Thread(ahi);
        Thread thread1=new Thread(ahi1);
        thread.start();
        thread1.start();

    }}

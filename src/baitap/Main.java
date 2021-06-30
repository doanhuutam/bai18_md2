package baitap;

public class Main {
    public static void main(String[] args) {
        NumberGenerator num1=new NumberGenerator("num1");
        NumberGenerator num2=new NumberGenerator("num2");
        Thread thread=new Thread(num1);
        Thread thread1=new Thread(num2);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("đây là một cái gì đó" );
        thread.start();
        thread1.start();
    }
}

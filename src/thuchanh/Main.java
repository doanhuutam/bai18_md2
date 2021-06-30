package thuchanh;

public class Main {
    public static void main(String[] args) {
        System.out.println("main thread rungning");
        RunnableDemo runnableDemo=new RunnableDemo("thraed -1-hr-database");
        runnableDemo.start();
        RunnableDemo runnableDemo1=new RunnableDemo("thread -2 send email");
        runnableDemo1.start();
        System.out.println("main thread stioper");
    }
}

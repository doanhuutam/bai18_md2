package racingcars;

public class Main {
    public static int DISTANCE=100;
    public static int STEP=2;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");
        Thread thread=new Thread(carA);
        Thread thread1=new Thread(carB);
        Thread thread2=new Thread(carC);
        System.out.println("distance:100km");
        thread.start();
        thread1.start();
        thread2.start();
    }
}

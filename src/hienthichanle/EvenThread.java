package hienthichanle;

public class EvenThread extends Thread{
@Override
    public void run(){
    try {
        for (int i=0;i<10;i++){
            if (i%2!=0){
                System.out.println("số lẻ là"+i);
            }
            Thread.sleep(15);
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}

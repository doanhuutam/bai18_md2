package hienthichanle;

public class OddThread extends Thread {
    @Override
    public void run(){
        try {
            for (int i=0;i<10;i++) {
                if (i % 2 == 0) {
                    System.out.println("hiển thị số chẵn" + i);
                }
                Thread.sleep(10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package ungdungdemso;

public class Count implements Runnable{
    private Thread myThread;
    public Count(){
        myThread=new Thread(this,"myrunnble");
        System.out.println("chủ đề tôi đã tạo"+myThread);
        myThread.start();
    }
    public Thread getMyThread(){
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++){
                System.out.println("in số"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("luồng chạy bị gián đoạn");
        }
        System.out.println("chuỗi chạy kết thúc");
    }
}

package ungdungdemso;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Count count=new Count();
        try {
            while (count.getMyThread().isAlive()){
                System.out.println("Chuỗi chính sẽ tồn tại cho đến khi chuỗi con hoạt động");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("chuỗi chính bị gián đoạn");
        }
        System.out.println("chuỗi chạy đã kết thúc");
    }
}

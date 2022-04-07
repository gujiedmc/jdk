/**
 * @author gujiedmc
 * @date 2021-10-28
 */
public class VolatileDemo {

    static volatile int value = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                value++;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                value++;
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("value = " + value);
    }
}

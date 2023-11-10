public class Threads extends Thread{
    public static void main(String[] args){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    fun1(); // Call your function within the run method
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threads");
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                fun2(); // Call your function within the run method
            }
        };
        Thread thread2 = new Thread(runnable1);
        thread2.start();

    }
    private synchronized static void fun1() throws InterruptedException {
        sleep(100000);
        System.out.println("Calling Thread1");
    }
    private static void fun2(){
        Object object = new Object();
        synchronized (object) {
            System.out.println("Calling Thread2");
        }
    }
}

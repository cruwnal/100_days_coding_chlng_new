public class ThreadDemo {

    public static void main(String[] args) {

        RunnableThread r = new RunnableThread();
        System.out.println("main thread is running");
        /*when we have created the RunnableThread object means one car is ready now we have to start this car*/
        Thread t1 = new Thread(r);
        Thread t = new Thread();
        t.setPriority(10);
t1.setPriority(5);
        t1.start();
      t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }


    }
}
class RunnableThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("child thread 1");
        }
    }

    public void firstThread(){
        for (int i = 0; i < 11; i++) {
//            System.out.println("child thread 1");
        }
        //System.out.println(Thread.currentThread());
    }
    public void firstThread1(){
        for (int i = 0; i < 11; i++) {
            System.out.println("child thread 2");
        }
    }
    public void firstThread2(){
        for (int i = 0; i < 11; i++) {
            System.out.println("child thread 3");
        }
    }

}
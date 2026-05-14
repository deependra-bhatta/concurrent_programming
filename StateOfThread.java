class MyThread extends Thread{
    @Override
    public void run(){

    }
}

public class StateOfThread{
    public static void main(String args[]) throws InterruptedException {
        MyThread obj = new MyThread();
        System.out.println(obj.getState());
        obj.start();
        System.out.println(obj.getState());
        Thread.sleep(200);
        System.out.println(obj.getState());
        System.out.println(Thread.currentThread().getName());
    }
}
class MyThread extends Thread {
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Mythread" + i);
        }
    }
    public void demo(){
        System.out.println("This is demo method.");
    }
}

class MyThread1 extends Thread{
    public void demo(){
        try{
            Thread.sleep(2000);
            System.out.println("This is demo method of MyThread1");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class StateOfThread1{
    public static void main(String args[]) throws InterruptedException {
        MyThread obj = new MyThread();
        obj.start();
        obj.join();
        System.out.println("This is main thread");
        obj.demo();
        obj.run();
        obj.start();
        MyThread1 obj1 = new MyThread1();
        obj1.start();
        System.out.println(obj1.getState());
        obj1.demo();
    }
}
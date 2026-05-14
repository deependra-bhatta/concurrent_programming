class MyThread implements Runnable{
    public void run(){
        System.out.println("This is from run method.");
    }
}
public class RunnableInterface{
    public static void main(String... args) throws Exception{
        MyThread obj = new MyThread();
        Thread obj1 = new Thread(obj);
        obj1.start();
        obj1.sleep(2000);
        System.out.println(obj1.getState());
    }
}
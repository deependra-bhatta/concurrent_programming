class MyThread extends Thread{
    public void run(){
        synchronized(DeadLockConcept.lock1){
            System.out.println("This thread1 is Locked");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
            }
            System.out.println("Thread 1 is waiting for lock2");
            synchronized(DeadLockConcept.lock2){
                System.out.println("thread 1 locks locked 2");
            }
        }
        
    }
}
class MyThread2 extends Thread{
    public void run(){
        synchronized(DeadLockConcept.lock1){
            System.out.println("thread2 is locked lock2");
            try{
                Thread.sleep(1000);
            }catch ( Exception e){
            }
            System.out.println("Thread 2 is watiting for lock1");
            synchronized(DeadLockConcept.lock2){
                System.out.println("thread 2 locks locked 1");
            }
        }
    }
     
}
public class DeadLockConcept{
    static Object lock1=new Object(); //static is used for 
    static Object lock2=new Object();
    public static void main (String args[]){
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.start();
        t2.start();
    }
}
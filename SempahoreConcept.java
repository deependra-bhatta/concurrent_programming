import java.util.concurrent.Semaphore; 
class MyThread extends Thread{
    Semaphore s; 
    MyThread(Semaphore s){
        this.s = s;
    }
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName() + "Waiting for permits");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "Using resources");
            System.out.println(Thread.currentThread().getName() + "releasing resources");
            s.release();
        } catch (Exception e){}
    }
}
public class SempahoreConcept{
    public static void main(String []args){
        Semaphore s = new Semaphore(2);
        MyThread t1 = new MyThread(s); 
        MyThread t2 = new MyThread(s);
        MyThread t3 = new MyThread(s);
        t1.start();
        t2.start();
        t3.start();
    }
}
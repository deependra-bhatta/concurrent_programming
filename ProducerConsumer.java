class Buffer{
    int data;
    boolean available=false; 
    synchronized void produce(int value){
        while(available){
            try{
                wait();
            }catch (Exception e){

            }
        }
        data = value; 
        available = true; 
        System.out.println("Data produced" + data);
        notifyAll();
    }
    synchronized void consume(){
        while(!available){
            try{
                wait();
            }catch(Exception e){

            }
        }
        available = false; 
        System.out.println("Data consumed" + data);
        notifyAll();
    }
}
class Producer extends Thread{
    Buffer b; 
    Producer(Buffer b){
        this.b = b;
    }
    public void run(){
        for(int i=1; i<=5; i++){
            b.produce(i);
        }
    }
}
class Consumer extends Thread{
    Buffer b; 
    Consumer(Buffer b){
        this.b = b;
    }
    public void run(){
        for(int i=1; i<=5; i++){
            b.consume();
        }
    }

}
public class ProducerConsumer{
    public static void main(String args[]){
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
    }
}
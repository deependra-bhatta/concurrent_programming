import java.util.concurrent.Semaphore;
class Customer extends Thread{
    Semaphore washingMachine; 
    Semaphore dryer;
    String name;
    Customer(Semaphore washingMachine, Semaphore dryer, String name){
        this.washingMachine = washingMachine;
        this.dryer = dryer; 
        this.name = name; 
    }
    public void run(){
        try{
            washingMachine.acquire();
            System.out.println("Using Washing Machine..");
            Thread.sleep(1000);
            washingMachine.release();

            dryer.acquire();
            System.out.println("Using Dryer..");
            Thread.sleep(1000);
            dryer.release();
        } catch (Exception e){}
    }
}
public class AssignmentDemo{
    public static void main(String []args){
        Semaphore washingMachine = new Semaphore(6);
        Semaphore dryer = new Semaphore(2);
        for(int i=0; i<5; i++){
            Customer c = new Customer(washingMachine, dryer, "Customer" + i);
            c.start();

        }
    }
}
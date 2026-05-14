class BankAccount{
    int balance = 1000;
    public synchronized void withdraw(int amount){
        if (balance>=amount){
            System.out.println(Thread.currentThread().getName() + "withdrawing amount" + amount);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            balance = balance - amount;
            System.out.println("Amount withdraww completeeddd...");
            System.out.println(Thread.currentThread().getName() + " Remaining Amount:" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " Insufficient balance");
        }
    }
}
class Customer extends Thread{
    BankAccount account;
    Customer(BankAccount account, String name){
        this.account=account;
        this.setName(name);
    }
    public void run(){
        account.withdraw(300);
    }
}
public class BankRaceCondition{
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        Customer c1 = new Customer(account,"Customer-1");
        Customer c2 = new Customer(account,"Customer-2");
        c1.start();
        c2.start();
    }
}
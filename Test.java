class A extends Thread{
    public void run(){
        System.out.println("This is from the run method.");
    }
    public void display(){
        System.out.println("This is display method.");
    }
}
public class Test{
    public static void main(String[] args){
        A obj = new A();
        obj.start();
        obj.display();
        obj.display();
    }
}

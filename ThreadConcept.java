class Mythread1 extends Thread{
    public int a=5;
    public int b = 0;
    public void run(){
        try{
            Thread.sleep(2000);
            for(int i=1;i<=5;i++){
                System.out.println("Mythread1 " + i);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void demo(){
        try{
            int c =a/b;
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        for(int i =1; i<=5; i++){
            System.out.println("Mythread2 " + i);
        }
    }
}
class Mythread3 extends Thread{
    public void run(){
        try{    
            Thread.sleep(20);
            for(int i=0; i<=5; i++){
                System.out.println("Mythread3");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class ThreadConcept{
    public static void main(String args[]){  
        Mythread1 obj =new Mythread1();
        obj.start();
        obj.demo();
        try{
            obj.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Mythread2 obj1 =new Mythread2();
        obj1.start();
        Mythread3 obj2 = new Mythread3();
        obj2.start();
    }
}
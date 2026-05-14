class Tester extends Thread {
    public void run(){
        System.out.println("Run");
    }
}

class Tester1 extends Thread {
    public void run(){
        Tester obj = new Tester();
        obj.run();
    }
}

public class Exam{
    public static void main(String args[]){
        Tester t= new Tester();
        t.run();
        t.start();
        t.run();
        Tester1 t1 = new Tester1();
        t1.start();
    }
}
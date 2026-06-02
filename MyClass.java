class MyClass{
    public static void main(String[] args){
        Test t = new Test();
        Thread obj = new Thread(t);
        obj.start();
        System.out.println("Main");
    }
}
class Test implements Runnable{
    public void run(){
        System.out.println("Run");
    }
}
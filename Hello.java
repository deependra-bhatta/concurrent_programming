public class Hello{
    int a;
    int b;
    public void display(){
        System.out.println("this is display method");
    }
    public int sum(int a, int b){
        return a+b;
    }
    public static void make(){
        System.out.println("this is static method");
    }
    public static void main(String args[]){
        Hello obj = new Hello();
        obj.display();
        int c = obj.sum(5,4);
        System.out.println(c);
        make();
        obj.display();
        Hello.make();
    }
}
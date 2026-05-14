class parent{
    public void demo(){
        System.out.println("Demoo");
    }
}
class child extends parent{
    public void display(){
        System.out.println("Displayingg....");
    }
}
public class Hellow{
    public static void main(String args[]){
        child c = new child();
        c.demo();
        c.display();
    }
}
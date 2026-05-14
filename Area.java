public class Area{
    private int length; 
    private int breadth; 

    public void setData(int length, int breadth){
        this.length=length; 
        this.breadth=breadth;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public int findArea(){
        return length*breadth; 
    }

    public static void main(String args[]){
        Area a=new Area();
        a.setData(5,4);
        System.out.println("The area is "+a.findArea());
    }
}
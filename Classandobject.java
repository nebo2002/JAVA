class Pen{
    String type;
    String color;
    
    public void write()
    
    {
        System.out.println("Writing");
    }
    
    public void printColor()
    {
        System.out.println(this.color);
    }
}

public class HelloWorld {
    public static void main(String args[])
   {
 
        Pen pen1=new Pen();
        pen1.type="gel";
        pen1.color="black";
        
        pen1.write();
        
        Pen pen2=new Pen();
        pen2.type="ballpoint";
        pen2.color="green";
        
        pen1.printColor();
        pen2.printColor();
   }
}

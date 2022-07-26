public class MutableExample 
{
     private String name;
     MutableExample(String name) 
     {
        this.name = name;
     }
     public String getName() 
     {
           return name;
     }
     public void setName(String name) 
     {
           this.name = name;
     }
     public static void main(String[] args) 
     {
           MutableExample obj = new MutableExample("hello2");
           System.out.println(obj.getName());
           obj.setName("hello3");
           System.out.println(obj.getName());
     }
}

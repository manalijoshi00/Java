public class MutableExample 
{
     private String s;
     MutableExample(String s) 
     {
        this.s = s;
     }
     public String getName() 
     {
           return s;
     }
     public void setName(String name) 
     {
           this.s = name;
     }
     public static void main(String[] args) 
     {
           MutableExample obj = new MutableExample("hello2");
           System.out.println(obj.getName());
           obj.setName("hello3");
           System.out.println(obj.getName());
     }
}

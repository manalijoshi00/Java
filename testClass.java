import java.io.*;
interface Example
{
     static int b = 7;
     static int c = 9;
     void display();
}
class testClass implements Example
{
     public void display()
     {
           System.out.println("Boy");
           System.out.println("Girl");
     }
     public static void main (String[] args)
     {
           testClass t = new testClass();
           t.display();
           System.out.println(b);
           System.out.println(c);
     }
}
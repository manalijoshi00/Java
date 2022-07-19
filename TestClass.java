import java.io.*;
interface Boy
{
     static int b = 7;
     void display1();
}
interface Girl
{
     static int c = 9;
     void display2();
}
     
class TestClass implements Boy,Girl
{
     public void display1()
     {
           System.out.println("Boy");
     }
     public void display2()
     {
           System.out.println("Girl");
     }     
     public static void main (String[] args)
     {
           TestClass t = new TestClass();
           t.display1();
           System.out.println(b);
           t.display2();
           System.out.println(c);
     }
}
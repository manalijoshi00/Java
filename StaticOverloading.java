class StaticOverloading 
{
    public static void display(String name)
    {
        System.out.println(" Hello " + name);
    }
    public static void display(String name, String beautiful)
    {
        System.out.println(beautiful + " " + name);
    }
    public static void main(String args[]) 
    {
        StaticOverloading s = new StaticOverloading();
        s.display("Prajali"); 
        s.display("Prajali,Good Afternoon"); 
    }
    
}

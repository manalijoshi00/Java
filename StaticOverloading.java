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
        Example.display("Prajali"); 
        Example.display("Prajali,Good Afternoon"); 
    }
    
}

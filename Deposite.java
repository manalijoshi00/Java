abstract class Bank
{
    public abstract void getBalance();
}
class BankA extends Bank
{
   public void getBalance()
   {
        System.out.println("Deposited Balance is = $100"); 
   }
}
class BankB extends Bank
{
    public void getBalance()
    { 
        System.out.println("Deposited Balance is = $150"); 
    }
}
class BankC extends Bank
{
    public void getBalance()
    { 
         System.out.println("Deposited Balance is = $200"); 
    }
}
class Deposite
{
     public static void main(String[] args)
     {
           BankA B1 = new BankA();
           B1.getBalance();
           BankB B2 = new BankB();
           B2.getBalance();
           BankC B3 = new BankC();
           B3.getBalance();
    }
}


class Transaction
{
     int currentbalance=15000,withdrawamt=10000,depositeamt=7000;
     public void withdraw()
     {
        currentbalance = currentbalance-withdrawamt;
        System.out.println("After Withdraw..."+currentbalance);
     }
     public void deposite()
     {
        currentbalance = currentbalance+depositeamt;
        System.out.println("After Deposite..."+currentbalance);
     }
}




  
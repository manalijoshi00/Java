import java.util.Scanner;
class OperatorExample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int Sum, Sub, Mul, Mod;
        float Div;

        Sum = a + b;
        Sub = a - b;
        Mul = a * b;
        Div = a / b;
        Mod = a % b;

        System.out.println("SUM = " + Sum);
        System.out.println("DIFFERENCE = " + Sub);
        System.out.println("PRODUCT = " + Mul);
        System.out.println("QUOTIENT = " + Div);
        System.out.println("MODULUS = " + Mod);
    }
}
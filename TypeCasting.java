class TypeCasting
{
  public static void main(String[] args)
  {
    char ch1 ='B';
    char ch2 ='C';
    int asciivalue1 = ch1;
    int asciivalue2 = ch2;
    char alp1 = (char)asciivalue1;
    char alp2 = (char)asciivalue2;
    System.out.println(" The TypeCasting letter is: " + alp1); 
    System.out.println(" The TypeCasting value of " + ch1 + " is: " + asciivalue1);
    System.out.println(" The TypeCasting letter is: " + alp2);
    System.out.println(" The TypeCasting value of " + ch2 + " is: " + asciivalue2);
  }
}

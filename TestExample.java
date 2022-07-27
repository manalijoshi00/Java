class TestExample 
{
       public static void main(String[] args)
       {
            String str = "Harshali";
            String a = "HELLO";
            char ch = a.charAt(2);
            System.out.println("The size of String is :" +str.length());
            System.out.println("Letter at the index position :" + ch);
            System.out.println("Index of position of letter :"  + a.indexOf('L'));
            System.out.println("Contains Method :" + a.contains("HE"));
            System.out.println("Lower Case :" + a.toLowerCase());
            System.out.println("Upper Case :" + a.toUpperCase());
            System.out.println("Substring Method :" + a.substring(1,5));
            System.out.println("Replace Method :" + a.replace('E','L'));
            System.out.println("EqualsIngnoreCase Method :" + a.equalsIgnoreCase("HELLO"));
        }
}
        
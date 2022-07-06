import java.util.Scanner;
class Student
{
   public static void main(String[] args)
   {
     System.out.println("STUDENT DETAILS");
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the Student ID");
     int studentId =s.nextInt();
     System.out.println("Enter the Student Name");
     String studentName =s.next();
     System.out.println("Enter the Student Gender(M/F)");
     char studentGender =s.next().charAt(0);
     System.out.println("Enter the Student Age");
     int studentAge =s.nextInt();
     System.out.println("Enter the Student Mobile No");
     char studentMobileNo =s.next().charAt(0);
     System.out.println("Enter the Student CCGPA");
     float studentCCGPA =s.nextFloat();
     System.out.println("Student ID:"+studentId);
     System.out.println("Student Name:"+studentName);
     System.out.println("Student Gender:"+studentGender);
     System.out.println("Student Age:"+studentAge);
     System.out.println("Student Mobile No :"+studentMobileNo);
     System.out.println("Student CCGPA:"+studentCCGPA);
   }
}
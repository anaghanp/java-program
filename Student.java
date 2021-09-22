import java.util.Scanner;
public class Student{
     public static void main(String  args[]) {
     String name;
     int roll;
     
    double mark;
    char grade;
    char[] branch; 

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Name:");
    name=sc.nextLine();
    System.out.print("Enter Roll number:");
    roll=sc.nextInt();
    System.out.print("Enter the branch: ");
    branch=sc.next().toCharArray(); 
    System.out.print("Enter mark:");
    mark=sc.nextDouble();
    System.out.print("Enter grade:");
    grade=sc.next().charAt(0);
    
     System.out.println("\n Student Details");
     System.out.println(" Name: "+name + "\n Roll.No: " + roll+ "\n Mark: " + mark + "\n Grade: " + grade + "\nBranch:");
     for(int i=0;i<branch.length;i++)
     {
     System.out.print(branch[i]);
     }
}
}
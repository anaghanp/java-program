import java.util.Scanner;

 class Employ
{
  int Empid;
  String Name;
  float Salary;
  String Address;
  
  public Employ(){
   Empid=0; Name=" "; Salary=0; Address=" ";
   }
public void input1()
{
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the employee number: ");
  Empid=sc.nextInt();
  System.out.print("enter the name: ");
  Name=sc.next();
  System.out.print("enter the employee salary: ");
  Salary=sc.nextFloat();
  System.out.print("enter the Address: ");
  Address=sc.next();
}
}
class Teacher extends Employ
{
  String Department;
  String Subject;
  
 public Teacher(){
  Department=""; Subject="";
  }
public void input2()
{
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the department and subject: ");
  Department=sc.next();
  Subject=sc.next();
}
 void display()
{
  System.out.println("employee id=" +Empid);
  System.out.println("employee name=" +Name);
  System.out.println("employee salary=" +Salary);
  System.out.println("employee address=" +Address);
  System.out.println("teacher department=" +Department);
  System.out.println("subject taught=" +Subject);
}
public static void main(String args[])
{
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the number of employees: ");
  n=sc.nextInt();
  Teacher t[]=new Teacher[n];
  
  for(int i=0; i<n; i++)
  { 
   t[i] = new Teacher();
   t[i].input1();
   t[i].input2();
  }
System.out.println("employee details: ");
for(int i=0; i<n; i++)
{
   t[i].display();
   System.out.print("\n");
}
}
}






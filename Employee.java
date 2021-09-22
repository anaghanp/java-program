import java.util.Scanner;
 

public class Employee{
  
  int eNO;
  String eName;
  float eSalary;

public void getInput(){
  
  Scanner sc=new Scanner (System.in);
  System.out.print("enter the employee no: ");
  eNO=sc.nextInt();
  System.out.print("enter the employee name: ");
  eName=sc.next();
  System.out.print("enter the salary: ");
  eSalary=sc.nextFloat();
}
 
public void display(){
 
 System.out.println("employee id=" +eNO);
 System.out.println("employee name=" +eName);
 System.out.println("employee salary=" +eSalary);
}


public static void main(String[] args){
  
  int n;
  int id;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number of employee: ");
  n=sc.nextInt();
  Employee e[]=new Employee[n];
  
  
 for(int i=0;i<n; i++)
 {
    e[i]=new Employee();
    e[i].getInput();
}
System.out.println("enter the id to search: ");
id=sc.nextInt();
System.out.println("  deatails as below  ");
 for (int i=0;i<n;i++)
{
    if(e[i].eNO==id)
       e[i].display();
    else
   {
    System.out.println("wrong id");
   }  
}
}
}

 


 
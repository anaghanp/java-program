import java.util.Scanner;
import java.lang.Math;
public class Oddeven{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int num=sc.nextInt();
if(num%2==0)
{
System.out.println("number"+num+"is even");
}
else
{
System.out.println("number"+num+"is odd");
}
}
}


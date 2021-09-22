import java.util.Scanner;
public class Positive{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int num=sc.nextInt();
String x=(num>0)?"POSITIVE":(num<0)?"NEGATIVE":"zero";
System.out.println("the number"+num+"is a"+x+"number");
}
}
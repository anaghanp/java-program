import java.util.Scanner;
import java.lang.Math;
public class Myclass{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int num=sc.nextInt();
double y=Math.sqrt(num);
System.out.println("sqrt of"+num+"="+y);
}
}
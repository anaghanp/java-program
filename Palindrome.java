import java.util.Scanner;
public class Palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int num=sc.nextInt();
int sum=0,r;
int temp=num;
while(num>0)
{
r=num%10;
sum=(sum*10)+r;
num=num/10;
}
if(temp==sum)
System.out.println("it is a palindrome number");
else
System.out.println("not a palindrome number");
}
}

import java.util.Scanner;
public class Largestnumber{
public static void main(String args[]){
int num,max;
Scanner sc=new Scanner(System.in);
System.out.print("enter number of elements in the array");
num=sc.nextInt();
int a[]=new int[num];
System.out.println("enter elements of array:");
for(int i=0;i<num;i++)
{
a[i]=sc.nextInt();
}
max=a[0];
for(int i=0;i<num;i++)
{
if(max<a[i])
{
max=a[i];
}
}
System.out.println("largest number:"+max);
}
}
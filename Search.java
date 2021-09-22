import java.util.Scanner;
public class Search{
public static void main(String args[]){
int n,x,count=0,i;
Scanner sc=new Scanner(System.in);
System.out.print("enter the number of elements in a array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter elements of array:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.print("enter the element to be search:");
x=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
count++;
}
}
if(count==0)
{
System.out.print("element" +x+ "not found");
}
else
{
System.out.print("element "+x+ "is found " +count+ " times " +(i+1));

}
}
}
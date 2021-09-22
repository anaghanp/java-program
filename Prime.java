import java.util.Scanner;
public class Prime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,j,n,c;
System.out.println("prime numbers are");
n=sc.nextInt();
for(i=2;i<=n;i++)
{
c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
c++;
}
}
if(c==2)
{
System.out.print(i+" ");
}
}
}
}
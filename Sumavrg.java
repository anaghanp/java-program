import java.util.Scanner;
public class Sumavrg{
public static void main(String args[]){
int num,sum=0;
float avrg;
Scanner sc=new Scanner(System.in);
System.out.print("enter the number of elements");
num=sc.nextInt();
int a[]=new int[num];
System.out.println("enter the elements:");
for(int i=0;i<num;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println("sum="+sum);
avrg=(float)sum/num;
System.out.println("average:"+avrg);
}
}
import java.util.Scanner;
public class Circle{
double r;
public double cir(){
return 2*3.14*r;
}
public double area(){
return 3.14*r*r;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the radius");
 Circle xCircle;
 xCircle=new Circle();
 xCircle.r=sc.nextInt();
 double ar=xCircle.area();
double cir=xCircle.cir();
System.out.println("area of circle " +ar);
System.out.println("circumference of circle " +cir);
}
}
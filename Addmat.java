import java.util.Scanner;
class Addmat{
public static void main(String args[]){
int row,col,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
row=sc.nextInt();
System.out.println("enter the number of columns");
col=sc.nextInt();
int mat1[][]=new int[row][col];
int mat2[][]=new int[row][col];
int sum[][]=new int[row][col];
System.out.println("enter the elements of the first matrix");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
mat1[i][j]=sc.nextInt();

System.out.println();
}
System.out.println("enter the elements of the second matrix");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
mat2[i][j]=sc.nextInt();

System.out.println();
}
for(i=0;i<row;i++)
for(j=0;j<col;j++)
sum[i][j]=mat1[i][j]+mat2[i][j];
System.out.println("sum of matrices:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
System.out.print(sum[i][j]+"\t");
System.out.println();
}
}
}


import java.util.Scanner;
public class largestnumber{
public static void main(String[] args)
{
int x,y,z;
System.out.println("enter three numbers");
Scanner in=new Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
z=in.nextInt();
if(x>y&&x>z)
System.out.println("first number is largest");
else if(y>x&&y>z)
System.out.println("second number is largest");
else if(z>x&&z>y)
System.out.println("third number is largest");
else
System.out.println("the numbers are not distinct");
}
}

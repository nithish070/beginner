import java.util.Scanner;
public class MultiplicationTable
{
public static void main(String args[])
{
int n, i;
System.out.println("Enter an integer to print multiplication table");
Scanner in = new Scanner(System.in);
n = in.nextInt();
System.out.println("Multiplication table of " + n);
for (i = 1; i <= 5; i++)
System.out.println(n + "*" + i + " = " + (n*i));
}
}

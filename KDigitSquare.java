import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class KDigitSquare 
{  
    public static long  firstkdigits(int n, int k) 
    { 
        double product = n * Math.log10(n); 
           double decimal_part = product - Math.floor(product); 
        decimal_part = Math.pow(10, decimal_part); 
        double digits = Math.pow(10, k - 1), i = 0; 
        return ((long)(decimal_part * digits)); 
    } 
    public static void main (String[] args) 
    { 
        int n = 1450; 
        int k = 6; 
        System.out.println(firstkdigits(n,k)); 
    } 
} 
 

public class Palindrome {
    public static void main(String[] args) {
        int num = 121, reversedInteger = 0, remainder,Integer;
        Integer = num;
         while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (Integer == reversedInteger)
            System.out.println(Integer + " is a palindrome.");
        else
            System.out.println(Integer + " is not a palindrome.");
    }
}

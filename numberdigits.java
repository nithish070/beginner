public class numberdigits{
public static void main(String[] args){
int count=0,num=3456;
while(num!=0)
{
num/=10;
++count;
}
System.out.println("number of digits:"+count);
}
}

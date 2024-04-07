
public class SwappNumbers
{
    public static void main(String args[])
    {
        int temp;
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.printf("Before swapping of two numbers a="+a+" b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.printf("\nAfter swapping of two numbers a="+a+" b="+b);
    }
}


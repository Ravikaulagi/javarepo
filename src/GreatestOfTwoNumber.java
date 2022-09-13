import java.util.Scanner;

public class GreatestOfTwoNumber
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the 2 numbers");
        int first=s.nextInt();
        int second=s.nextInt();
        int third =s.nextInt();
        if(first>second)
        {
            System.out.println("the grater number is " +first);
        }
        else
        {
            System.out.println("the greater number is "+second);
        }
    }
}

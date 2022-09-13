import java.util.Scanner;

public class GreatstOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        if(num1>num2&&num1>num3)
        {
            System.out.println("the greatest number is " +num1);
        }
        else if(num2>num1&&num2>num3)
        {
            System.out.println("the gratest number is " +num2);
        }
        else
        {
            System.out.println("the greatest number is "  +num3);
        }
    }
}

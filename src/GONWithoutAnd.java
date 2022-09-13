import java.util.Scanner;

public class GONWithoutAnd
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        int mid=(num1>num2)?num1:num2;
        int res=num3>mid?num3:mid;
        System.out.println("result " +res);
    }
}

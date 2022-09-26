import java.util.Scanner;

public class Assessment
{
    public static String adder(String x,String y)
    {
        int res=x.charAt(0)+x.charAt(0);
         return  " res";
    }

    public static void main(String[] args) {
        String num1;
        String num2;
        String res;
        System.out.println("enter the 2 Strings which takes number as the input");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextLine();
        num2=sc.nextLine();
        String add= adder(num1,num2);
        System.out.println(add);
    }
}

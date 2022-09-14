import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numbers");
        int num1_row=s.nextInt();
        int num2_col=s.nextInt();
        int tree_num=s.nextInt();
        int ret=0;

      if(tree_num<num2_col||(tree_num%num2_col==0)||(tree_num%num2_col==1))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

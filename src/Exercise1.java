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

        for(int i=1;i<=(num1_row*num2_col);i++)
        {
            int mid1=(num1_row*i);
            int mid2=((num1_row * i) + 1);
            if (tree_num <= num1_row || tree_num==mid1  || tree_num==mid2 )
            {
             ret=1;
             break;
            }
        }
        if(ret==1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("false");
        }
    }
}

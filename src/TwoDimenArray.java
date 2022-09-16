
import java.util.Scanner;

public class TwoDimenArray
{
    public static void main(String[] args) {
        System.out.println("enter the length of the array");
        int row=0,for_dig=0,col=0,back_dig=0;
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
      //  int n=len-1;
        int arr[][]=new int[len][len];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                arr[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<len;i++)
        {
            for (int j = 0; j < len; j++)
            {
                if (i == j)
                {
                    for_dig += arr[i][i];
                }
                
                row += arr[i][j];
                col += arr[j][i];
            }

                back_dig += arr[i][len-1-i];

        }
        for_dig =for_dig*len;
        back_dig = back_dig*len;
        if(row==col&&col==for_dig&&col==back_dig&&for_dig==back_dig)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}

import java.util.Scanner;

public class TwoDimenArray
{
    public static void main(String[] args) {
        System.out.println("enter the length of the array");
        int dig1=0,dig2=0;
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
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
            for(int j=0;j<len;j++)
            {
                if(i==j)
                {
                    dig1+=arr[i][j];
                }
                if(i+j+1==len)
                {
                    dig2+=arr[i][j];
                }
            }
        }
        if(dig1==dig2)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}

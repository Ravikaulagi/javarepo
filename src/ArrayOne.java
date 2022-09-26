import java.util.Scanner;
public class ArrayOne
{
    public static void main(String[] args) {
       System.out.println("enter the length of the array");
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        //int num;
        int arr[]=new int[len];
       System.out.println("enter the array element");
        for(int i=0;i<len;i++)
        {
            arr[i]=s.nextInt();
        }

        int  num=arrayProgram(arr);
        if(num==1)
        {
            System.out.println("all are even element");
        } else if (num==2)
        {
            System.out.println("all are odd element");
        }
        else
        {
            System.out.println("array contain mixed elements");
        }
    }
   public  static int arrayProgram(int arr1[])
    {
        int j=0,k=0;
       // int num1=0,num2=0,num3=0;
        int len=arr1.length;
        for(int i=0;i<len;i++)
        {
            if(arr1[i]%2==0)
            {
               j++;
            }
            else
            {
                k++;
            }
        }
        if(j==len)
        {
            return 1;
        }
        else if(k==len)
        {
            return 2;
        }
        else
        {
         return 3;
        }
    }
}

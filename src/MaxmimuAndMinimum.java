import java.util.Scanner;

public class MaxmimuAndMinimum
{
    public static void main(String[] args) {
        System.out.println("enter the length of the array");
        Scanner s=new Scanner(System.in);
        int max=0,min=99999999,diff;
        int len=s.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<len;i++)
        {
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        diff=max-min;
        System.out.println("the range of value " +diff);
    }
}

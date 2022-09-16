import java.util.Scanner;

public class ExceptionExercise
{

    public static void main(String[] args) {
        System.out.println("enter the age");
      //  int arr
        Scanner sc=new Scanner(System.in);
        int len= sc.nextInt();

        try
        {
            int []arr=new int[len];
            for(int i=0;i<len;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(arr[len]);
        }
        catch (Exception e)
        {
            System.out.println("something went wrong");
        }
        finally
        {
            System.out.println("the code ran successfully");
        }
    }

}

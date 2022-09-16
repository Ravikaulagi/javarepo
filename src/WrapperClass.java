import java.util.Scanner;

public class WrapperClass
{
    int var;
    public WrapperClass(int num)
    {
      var=num;
    }
    public int getInt()
    {
        return  var;
    }
    public String toString()
    {
        return  Integer.toString(var);
    }
    public static void main(String[] args) {
        {
            System.out.println("enter the number");
            int num;
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
           WrapperClass obj=new WrapperClass(num);
            System.out.println(obj.getInt());
            System.out.println(obj.toString());
        }
    }
}

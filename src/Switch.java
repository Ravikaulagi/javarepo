import java.util.Scanner;

public class Switch
{
    public static void main(String[] args) {
        System.out.println("enter the day");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thruesday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("it is not a day");
        }
    }
}

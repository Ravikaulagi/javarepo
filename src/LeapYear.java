import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        if(y%4==0||y%400==0&&y%100!=0)
        {
            System.out.println("given year is leap year");
        }
        else
        {
            System.out.println("it is not a leap year");
        }
    }
}

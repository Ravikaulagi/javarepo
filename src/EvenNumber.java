import java.util.Scanner;

public class EvenNumber
{
    public static void main(String[] args) {
        System.out.println("enter the number" );
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num==1)
        {
            System.out.println(1);
            System.out.println(0);
        }
        else {
            System.out.println(num);
        while(num!=1) {

            if (num % 2 == 0) {
                num = num / 2;
                System.out.println(num);

            } else {
                num = (3 * num) + 1;
                System.out.println(num);

            }

        }
        }


    }
}

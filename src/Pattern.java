import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;

import java.util.Scanner;

public class Pattern
{
    public static void main(String[] args) {
        System.out.println("enter the length");
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        for(int i=1;i<=len;i++)
        {
            for(int j=1;j<=i;j++)
            {
                char c=(char)(64+j);
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }
}

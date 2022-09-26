import java.util.Scanner;

public class HolidayClass
{
    private String name;
    private int day;
    private String month;

     public  HolidayClass(String name,int day,String month)
    {
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public static boolean inSameMonth(HolidayClass h1,HolidayClass h2)
    {
        System.out.println("hi");
         if(h1.month.equals(h2.month))
         {
             return true;
         }
         else
         {
             return  false;
         }
    }
    public static double avgDate(HolidayClass []ho)
    {
        double res=0;
        for(int i=0;i< ho.length;i++)
        {
            res+=ho[i].day;
        }
        res=res/ ho.length ;
        return res;
    }

    public static void main(String[] args)
    {
     HolidayClass ho1=new HolidayClass("chrismas",4,"feb");
     HolidayClass ho2=new HolidayClass("deppa",12,"feb");
      HolidayClass hL[]=new HolidayClass[2];
     hL[0]=ho1;
     hL[1]=ho2;
     boolean res=inSameMonth(hL[0],hL[1]);
        System.out.println(res);
        double res1=avgDate(hL);
        System.out.println(res1);
    }
}

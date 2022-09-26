class Hero
{
    public  boolean isMatch(String name,int num)
    {
        if(name=="IronMan"&&num==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int isMatch(int num1,int num2)
    {
        return num1+num2;
    }
    public void isMatch()
    {
        System.out.println("Hero");
    }

}


public class StaticPolymorphism
{
    public static void main(String[] args) {
        Hero h=new Hero();
        System.out.println(h.isMatch("Marvel",1));
        System.out.println(h.isMatch(1,2));
        h.isMatch();
    }
}

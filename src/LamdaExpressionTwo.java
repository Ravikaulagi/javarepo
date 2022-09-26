public class LamdaExpressionTwo
{
    public static void main(String[] args)
    {
        Two t =(x,y)-> System.out.println(x +" " + y);
        t.add(1,2);
    }
}

interface  One
{
    void run();
}

public class LamdaExpression
{
    public static void main(String[] args)
    {
        One o= ()-> System.out.println("I am running");
        o.run();
    }
}

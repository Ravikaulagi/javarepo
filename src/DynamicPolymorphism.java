class Animal
{
    public void food()
    {
        System.out.println("cow eats grass");
    }
    public void usage()
    {
        System.out.println("cow gives us milk");
    }
}
class sheep extends Animal
{
    public void food()
    {
        System.out.println("sheep eats grass");
    }
//    public void age()
//    {
//        System.out.println("sheep age is 15");
//    }
}
public class DynamicPolymorphism
{
    public static void main(String[] args) {
        Animal a=new sheep();
        a.food();
        a.usage();

    }
}

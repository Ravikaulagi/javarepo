
import java.util.Random;

class  ColorJava
{
    String[] str={"White","Yellow","Purple","Red"};
    public void color()
    {
        Random ra=new Random();
       int strIndex=ra.nextInt(str.length);
       String select=str[strIndex];
        System.out.println(select);
    }
}
 class Ghost extends ColorJava
{
    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        ghost.color();
    }
}


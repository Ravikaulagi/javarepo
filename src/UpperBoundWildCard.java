import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCard<T>
{
    public static void main(String[] args) {
      //  UpperBoundWildCard w=new UpperBoundWildCard();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        print(integerList);
        List<Float> FloatList=new ArrayList<>();
        FloatList.add(1.1f);
        FloatList.add(1.2f);
        FloatList.add(1.12f);
        print(FloatList);

    }
    public static void  print(List<? extends Number> listOfAdd)
    {
        System.out.println(listOfAdd);
    }
}

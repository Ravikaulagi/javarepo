import java.util.ArrayList;
import java.util.List;

public class WildCard
{
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        printList(integerList);
        List<Float> FloatList=new ArrayList<>();
        FloatList.add(1.1f);
        FloatList.add(1.2f);
        FloatList.add(1.3f);
        printList(FloatList);
    }
    public  static void printList(List<?> listOfAll)
    {
        System.out.println(listOfAll);
    }
}

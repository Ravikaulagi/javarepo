import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MysteryClassContinue implements MysteryColorAnalyzer
{
    public  int numberOfDistinctColor(List<Color> arr) {
        ArrayList<Color> arr1 = new ArrayList<Color>();
        Iterator itr = arr.iterator();
        for (Color str : arr) {
            if (arr1.isEmpty()) {
                arr1.add(str);
            } else {
                int len = arr1.size();
                int j = 0;
                for (Color str1 : arr1) {
                    if (str1.equals(str)) {
                        break;
                    }
                    j++;
                }
                if (len == j) {
                    arr1.add(str);
                }

            }
        }
        int res = arr1.size();
        return res;
    }

    public   int colorOccurrence(List<Color>MysteryColor,Color color)
    {
        Iterator itr=MysteryColor.iterator();
        int res=0;
        while (itr.hasNext())
        {
            if(itr.next()==color)
            {
                res++;
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        ArrayList<Color> list=new ArrayList<Color>(8);
        list.add(Color.RED);
        list.add(Color.GREEN);
        list.add(Color.RED);
        list.add(Color.GREEN);
        list.add(Color.BLUE);
        list.add(Color.GREEN);
        list.add(Color.BLACK);
        list.add(Color.GREEN);
        System.out.println(list);
        int res=new MysteryClassContinue().numberOfDistinctColor(list);
        System.out.println(res);
        int res1=new MysteryClassContinue().colorOccurrence(list,Color.GREEN);
        System.out.println(res1);

    }
}



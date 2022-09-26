import java.util.ArrayList;
import java.util.Iterator;

class PeekingIterator implements Iterator<Integer>
{
    Iterator<Integer> itr;
    Integer peek;
   public PeekingIterator(Iterator<Integer>nums)
   {
    itr=nums;
    peek=null;
   }
    @Override
    public boolean hasNext()
    {
        return itr.hasNext();
    }

    @Override
    public Integer next() {
        if(itr.hasNext())
        {
            peek= itr.next();
            return peek;

        }
        else
        {
            return  null;
        }
    }


    public Integer peek()
    {
        return peek;
    }

    @Override
    public void remove() {

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        PeekingIterator ptr=new PeekingIterator(arr.iterator());
        System.out.println(ptr.next());
        System.out.println(ptr.peek());
        System.out.println(ptr.hasNext());

    }


}
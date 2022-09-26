import java.util.ArrayList;
import java.util.Scanner;

public class Browser
{
    int curr_index=1;
    ArrayList<String> History=new ArrayList<>();

    public void Browser()
    {
        System.out.println("you are in home page");
    }
    public void visit(String url)
    {
            History.add(curr_index+1,url);
            curr_index++;
            if(curr_index!=(History.size()-1))
            {
                History.subList(curr_index+1,History.size()).clear();
                System.out.println(History);
            }
        System.out.println("you moved to "+url);
    }
    public void forward(int steps)
    {
        if(steps>History.size()-curr_index-1)
        {
            steps=History.size()-curr_index-1;
        }
        curr_index+=steps;
        System.out.println("you moved to "+History.get(curr_index));
    }
    public void backWard(int steps)
    {
        if(steps>curr_index)
        {
            steps=curr_index;
        }
        curr_index=steps;
        System.out.println("you have moved to"+History.get(curr_index));

    }
   public void exit()
   {
       System.out.println("");
   }

    }

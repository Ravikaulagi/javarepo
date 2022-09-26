public class Movie
{
    private final String title;
    private final String studio;
    private final  String rating;

    public Movie(String title, String studio,String rating)
    {
        this.title=title;
        this.studio=studio;
        this.rating=rating;

    }
    public Movie(String title,String studio)
    {
        this.title = title;
        this.studio=studio;
        rating="PG";
    }
    public static  Movie[] getPg(Movie[] mo)
    {
        int len= mo.length;
        Movie m1[]=new Movie[len];
        int  j=0;
       for(int i=0;i< mo.length;i++)
              if(mo[i].rating.equals("PG"))
              {
                  m1[j] = mo[i];
                  j++;
              }
        return  m1;
    }

    public static void main(String[] args)
    {
      Movie m=new Movie("Casino Royale","Eon Productions","PG-13");
      Movie m1=new Movie("KGF 2","Hombale Films","PG");
      Movie m2=new Movie("avenger","marvel");
      Movie mov[]=new Movie[3];
      mov[0]=m;
      mov[1]=m1;
      mov[2]=m2;
        Movie move[]=getPg(mov);
        for(int i=0;i< move.length ;i++)
        {
            if(move[i]!=null)
                 System.out.println(move[i].rating+" "+move[i].studio+" "+move[i].title);
        }
    }
}


public class NameMe
{  private final String firstName;
  private final  String lastName;
   private final String name;
    public NameMe(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
         name=firstName+lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        NameMe name=new NameMe("John","Doe");
        System.out.println( name.getFirstName());
        System.out.println(name.getLastName());
        System.out.println(name.getName()) ;
    }
}

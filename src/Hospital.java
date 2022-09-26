 class Hospital     //parent
{
    String hospital="AIIMS hospital";
    String patientName="xyz";
}
 class medical extends Hospital     //single
 {
     int patientId=12;
     public static void main(String[] args)
     {
         medical  me=new medical();
         System.out.println(me.hospital);
         System.out.println(me.patientName);
         System.out.println(me.patientId);
     }
 }
 class Doctor extends Hospital       //hierarchical
 {
     String doctorName="abc";

     public static void main(String[] args) {
         Doctor d=new Doctor();
         System.out.println(d.hospital);
         System.out.println(d.patientName);
         System.out.println(d.doctorName);
     }
 }

class medicalStore extends Hospital  //multilevel
{
    String Tablet="ultraset";
}


class Fee extends medicalStore  //multilevel
{
    int fee=25000;
    public static void main(String[] args)
    {
       Fee fe=new Fee();
        System.out.println(fe.hospital);
        System.out.println(fe.patientName);
        System.out.println(fe.Tablet);
        System.out.println(fe.fee);
    }
}
class All extends Hospital implements Reports  //multiple
{
    @Override
    public void reports()
    {
        System.out.println("Reports are normal");
    }

    public static void main(String[] args)
    {
        All a=new All();
        System.out.println(a.hospital);
        System.out.println(a.patientName);
        a.reports();
    }
}


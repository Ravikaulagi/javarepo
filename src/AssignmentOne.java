public class AssignmentOne
{
    public static void main(String[] args) {
        String strs[]={"dog","racecar","car"};
        int len= strs.length;
        int resLen=0;
        String resStr="";
        for(int i=0;i<len;i++)
        {
            String s1=strs[i];
            for(int j=i+1;j<len;j++)
            {
                String s2=strs[j];
                int k=0,l=0;
                String str="";
               int   len1=s1.length();
               int   len2=s2.length();
                while(k<len1&&l<len2&&s1.charAt(k)==s2.charAt(l))
                {
                        str = str + s1.charAt(k);
                        k++;
                        l++;

                }
                int llen=str.length();
                if(llen>resLen)
                {
                   resStr=str;
                   resLen=llen;
                }

            }
        }
        if(resLen==0)
        {
            System.out.println("Their is no common prefix");
        }
        else
        {
            System.out.println(resStr);
        }
    }
}

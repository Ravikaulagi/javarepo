import java.util.Scanner;

public class LongestPallindrome
{
    public static int Exercise(String currStr){
        int start=0, end=currStr.length()-1;
        while(start<end){
            if(currStr.charAt(start)!=currStr.charAt(end)){
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String str = s.next();
        int len = Integer.MIN_VALUE;
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            String currStr = "";
            for (int j = i; j < str.length(); j++) {
                currStr = currStr + str.charAt(j);
                int pallindrome = Exercise(currStr);
                if (pallindrome == 1 && currStr.length() > len) {
                    res = currStr;
                    len = currStr.length();
                }
            }
        }
        System.out.println("the logest pallindrome is :" +res);
    }
}

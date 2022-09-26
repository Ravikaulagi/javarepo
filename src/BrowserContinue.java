import java.util.Scanner;

public class BrowserContinue {
    public static void main(String[] args) {
        Browser newTab = new Browser();
        Scanner sc = new Scanner(System.in);
        String command;
        String url;
        int steps;
        while (sc.hasNext()) {
            command = sc.next();
            if (command.contains("Browser"))
            {
                newTab.Browser();
            } else if (command.contains("visit"))
            {
                System.out.println("enter the url");
                url=sc.nextLine();
                newTab.visit(url);
            } else if (command.contains("forWard"))
            {
                System.out.println("enter the number of steps");
                steps=sc.nextInt();
                newTab.forward(steps);
            } else if (command.contains("backWard"))
            {
                System.out.println("enter the number of steps");
                steps=sc.nextInt();
                newTab.backWard(steps);
            }
            else if(command.contains("exit"))
            {
                System.out.println("you are exit from the browSer");
                break;
            }
            else
            {
                System.out.println("enter the valid url");
            }
        }
    }
}

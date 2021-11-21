import java.util.Scanner;

public class checkMonth {
    public static void main(String[] args) {
        //String month="feb";
        //chkMonth(month);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Month:");
        String nxt = sc.next();
        System.out.println("The Month is: "+nxt);
        chkMonth(nxt);
    }
    public static void chkMonth(String Month) {
        if(Month.equals("jan") || Month.equals("mar") || Month.equals("may") || Month.equals("jul")|| Month.equals("aug") ||Month.equals("oct") || Month.equals("dec")) {
            System.out.println("Number of days in "+Month+" are: 31");
        } else if(Month.equals("apr") || Month.equals("jun") ||Month.equals("sept") || Month.equals("nov")) {
            System.out.println("Number of days in "+Month+" are: 30");
        } else {
            System.out.println("Number of days in "+Month+" are: 28");
        }
    }
}

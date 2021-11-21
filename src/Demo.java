
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1;
        System.out.println("Enter String here: ");
        str1 = obj.next();
        System.out.println("String is: " + str1);
        reverse(str1);
        int ty;
    }

    public static void reverse(String str) {
        int len = str.length();
        char[] ch = new char[len];
        int j = 0;
        for (int i = (len - 1); i >= 0; i--) {
            ch[j] = str.charAt(i);
            str.toCharArray();
            j++;
        }
        String str2 = new String(ch);
        System.out.println("String in reverse order is: " + str2);
        if (str.equals(str2)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("Not Correct");
        }
    }
}







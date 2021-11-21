
import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        String str="Amin";
        String s=str.concat(" Singh");
        int n = s.indexOf("in");
        int n1 = s.indexOf("n", 4);
        int an = s.lastIndexOf("in",8);
        String replace = s.replace("in", "gt");
        String ing = s.substring(2,7);
        System.out.println(ing);
        Integer integer = Integer.valueOf("a");
        System.out.println(integer);

    }

}


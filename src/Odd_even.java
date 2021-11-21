import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a=obj.nextInt();
        Test(a);
    }
    public static void Test(int x) {
        if(x%2==1){
            System.out.println("Odd Number: "+x);
        }
        else {
            System.out.println("Even number: "+x);
        }
    }

}

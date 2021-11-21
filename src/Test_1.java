import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = obj.nextInt();
        System.out.println("Enter Second Number: ");
        int num2=obj.nextInt();
        System.out.println("Enter Third Number: ");
        int num3=obj.nextInt();
        System.out.println("Largest of 3 numbers is:" + largest(num1, num2, num3));
    }

    public static int largest(int x, int y, int z) {
        int large = 0;
        if(x>y && x>z) {
            large = x;
        } else if(y>x && y>z) {
            large = y;
        } else {
            large=z;
        }
        return large;
    }
}

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number: ");
       int num1=obj.nextInt();
       //sumOfNumbers(num1);
        //factorial(num1);
       fibonacci(num1);
    }
    public static void sumOfNumbers(int a) {
        int num=0; int i=0;
//        for(int i=0;i<=a;i++) {
//           num+=i;
//        }
        while(i<=a) {
            num+=i;
            i++;
        }
        System.out.println("Sum of first "+a+" numbers is: "+num);
    }
    public static void factorial(int a) {
        int num=1; int i=a;
//        for(int i=a;i>0;i--) {
//            num=num*i;
//        }
        while(i>0) {
            num*=i;
            i--;
        }
        System.out.println("Factorial of number "+a+" is:"+num);
    }
    public static void fibonacci(int a) {
        int first =0; int second =1; int third=0; int i=0;
        System.out.print("Fibonacci series till first "+a+" number is: "+first+" "+second+" ");
//        for(int i=0;i<a;i++) {
//            third= first+second;
//            first= second;
//            second= third;
//            System.out.print(" "+third+" ");
 //       }
        do {
            third = first+second;
            first= second;
            second=third;
            System.out.print(" "+third+" ");
            i++;
        }while(i<a);
    }

}

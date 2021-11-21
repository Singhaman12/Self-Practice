
import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {
        //sum();
        //name();
        avg();
    }

    public static void sum() {
        int[] array1 = new int[10];
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter " + (i + 1) + " number of array ");
            array1[i] = obj.nextInt();
        }
        int num = 0;
        System.out.println("Array is: ");

        for (int i = 0; i < 10; i++) {
            num += array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of Array elements: " + num);
    }

    public static void name() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length of First Name: ");
        int len = obj.nextInt();
        char[] firstName = new char[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter " + (i + 1) + " Letter of Name: ");
            firstName[i] = obj.next().charAt(0);
        }
        System.out.println("Entered Name is: ");
        for (int i = 0; i < len; i++) {
            System.out.print(firstName[i]);
        }
    }

    public static void avg() {
        Scanner obj = new Scanner(System.in);
        int[][] array1 = new int[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter " + i + " " + j + " element of array: ");
                array1[i][j] = obj.nextInt();
            }
            System.out.println();
        }
        System.out.println("Entered 2D Array is: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + array1[i][j]);
            }
            System.out.println();
        }
        double [] sum1={0,0,0}; double [] avg1={0,0,0};
        for(int i=0;i<5;i++){
            sum1[0]+=array1[i][0];
            sum1[1]+=array1[i][1];
            sum1[2]+=array1[i][2];
            }
        avg1[0]= sum1[0]/5;
        avg1[1]=sum1[1]/5;
        avg1[2]=sum1[2]/5;
        for(int i=0;i<3;i++) {
            System.out.println("Average of "+(i+1)+" column is:"+avg1[i]);
        }
    }
}
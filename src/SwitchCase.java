
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
      //Scanner obj=new Scanner(System.in);
      int [][] ar= new int[3][3];
      //for (int i=0;i<3;i++){
         // for (int j=0;j<3;j++) {
              //System.out.println("Enter "+i+j+" number: ");
              //ar[i][j]=obj.nextInt();
          //}
//          System.out.println("Enter "+(i+1)+" number: ");
//          ar[i]=obj.nextInt();

        System.out.println("Array is: ");
      for(int i=0;i<3;i++) {
          for (int j = 3; j>i; j--) {
              System.out.print("*");
          }
          System.out.println();
      }
}

}

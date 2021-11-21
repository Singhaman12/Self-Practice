import java.util.Scanner;

public class PracticeClass {
    public static void main(String[] args) {
        //int[] arr = {2, 4, 1, 300, 6, 5, 660};
        int val; boolean tryguess=true;
        int num=(int) (Math.random()*100);
        Scanner obj = new Scanner(System.in);
        System.out.println("enter guess between 1-100: ");
        while(tryguess==true) {
        val = obj.nextInt();
        if(val==num){
            System.out.println("Guess is correct");
            tryguess=false;
        }else if(val<num){
            System.out.println("Guess is smaller than actual number try again");
        } else {
            System.out.println("Guess is larger than actual number try again");
        }
        }
        System.out.println("i guessed "+num);
        }
    }
//    public static void guess(int val) {
//        Scanner obj=new Scanner(Systrm.in);
//        int num=(int) (Math.random()*100);
//        if(val==num) {
//            System.out.println("Your guess is true");
//        } else if(val<num){
//            System.out.println("Your guess is little bit smaller");
//
//        } else{
//            System.out.println("Your guess is little bit bigger");
//        }
//
//    }
//}


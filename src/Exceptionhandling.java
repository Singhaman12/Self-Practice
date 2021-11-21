import java.io.IOException;

public class Exceptionhandling {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c;
        c = a / b;
       //try {
            age(8);
       // } catch (NewUser e) {
           // System.out.println("Catched Exception");
      //  }
        System.out.println("Correct Age");
    }
        //throw new ArithmeticException("Not correct");
        //System.out.println(c);
//        catch(ArithmeticException e){
//            System.out.println("Exception handeled");
//        }

    public static void age(int age) throws NewUser  {
        if(age<10){
            throw new NewUser(" Not correct age");
            //System.out.println("Not Correct Age");
        }
    }
}

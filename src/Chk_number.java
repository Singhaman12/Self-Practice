public class Chk_number {
    public static void main(String[] args) {
        int a=-3245;
        Check(a);
    }
    public static void Check(int x) {
        if(x<0) {
            System.out.println("Negative number: "+x);
        }
        else {
            System.out.println("Positive number:"+x);
        }
    }
}

public class Rect {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        //System.out.println(" Area: "+area(a,b));
         //System.out.println(" Perimeter: "+peri(a,b));
        area(a, b);
        peri(a, b);

    }
    public static void area(int x, int y) {
        //return((x*y));
        System.out.println("Area: " + (x * y));
    }


    public static void peri(int x, int y) {
        //return((2*x)+(2*y));
       System.out.println("Perimeter: " + ((2 * x) + (2 * y)));
    }
}

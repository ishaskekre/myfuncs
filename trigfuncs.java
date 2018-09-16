import java.util.Scanner;
public class trigfuncs {
    public static void main(String[] args) { 
        Scanner keybd = new Scanner(System.in);
        System.out.println("enter any angle in degrees: ");
        double x = keybd.nextInt();

        double sinsum = myfuncs.mysin(x);
        System.out.println("Sin of " + x + " degrees is = " + sinsum);

        double cossum = myfuncs.mycos(x);
        System.out.println("Cos of " + x + " degrees is = " + cossum);

        double tansum = myfuncs.mytan(x);
        System.out.println("Tan of " + x + " degrees is = " + tansum);
    }
}

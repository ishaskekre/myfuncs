import java.util.Scanner;
public class basechange{
	public static void main(String[] args) {
		Scanner keybd = new Scanner(System.in);
		
		System.out.println("enter number: ");
		int n = keybd.nextInt();
		System.out.println("enter base: ");
		int m = keybd.nextInt();
		int l = n;
		int j = (int)(Math.log(n)/Math.log(m) + 1);
		int[] base = new int[j];
		for (int i = j-1; i >= 0; i--){
			int g = n;
			n = n/m;
			base[i] = g%m;
			System.out.println("n=" + n + " m =" + m + " i =" + i + " base[i]=" + base[i]);
				
		}
		System.out.print("the number " + l + " in base " + m + " is... ");
		for (int i = 0; i <j; i++){
			System.out.print(base[i]);
		}
	}
}
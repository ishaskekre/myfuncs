public class myfuncs {
	public static double sqroot(double a, double epsilon, double b){
		double x;
		 b = a/2;
		while (Math.abs(((b *b - a)/a)) >= 0.001) {
			b = 0.5 * (b + a/b);
		}
			return(b);
	}	


	public static void myshuffle (int [] x){
		int n=x.length;
		int rp,temp;
		for (int i = n-1; i>=1; i--){
			rp = (int)((i + 1) * Math.random());
			temp = x[rp];
			x[rp] = x[i];
			x[i] = temp;
			/*System.out.println("array #" + (n-i) + " : ");
			for (int a = 0;a<n; a++){
			System.out.print(" " + x[a]);
			}
			System.out.println();*/
		}
	}

	public static double mysin(double x){

		double rad = x *3.14159265/180;
        double n = 1.0; 
        double sum  = 0.0; 

        for (int i = 1; n != 0.0; i++) {
            n *= (rad / i);
            if (i % 4 == 1) sum += n;
            if (i % 4 == 3) sum -= n;
        }
     	return(sum);
	}

	public static double mycos(double x){

		double rad = x *3.14159265/180;
        double n = 1.0; 
        double sum  = 1.0; 

        for (int i = 1; n != 0.0; i++) {
            n *= (rad / i);
            if (i % 4 == 0) sum += n;
            if (i % 4 == 2) sum -= n;
        }
     	return(sum);
	}

	public static double mytan(double x){
		double sumsin = mysin(x);
		double sumcos = mycos(x);
		double sum = 0;

		if (sumcos != 0)
			sum = mysin(x)/mycos(x);
		else
			System.out.println("undefined");
		return (sum);
	}

	public static boolean myprime(int x){
		int n = (int)(Math.sqrt(x));
		int f = 0;
		for (int i = 2; i<=n; i++){
			if (x%i==0){
				f++;
				break;
			}
		}
		if (f==1)
			return(false);
		else 
			return(true);
	}


	/*public static double[][] get(double[][]x,double[][]y,int m,int n,int p){
		x = new double[m][p];
		y = new double[p][n];

		z = x * y;

	}*/

	/*public static boolean isPalindrome(String x){
		String y = "";
		int z = x.length();
		int w = z;
		for (int i = 0; i<z; i++){
			y += x.charAt(z - 1);
			w--;
		}
		if (y.toUpperCase().equals(x.toUpperCase()))
			System.out.println(x + " is a Palindrome.");
		else
			System.out.println(x + " is NOT a Palindrome.");
	}*/

	public static int sum(int n){
		if(n==1)
			return(1);
		else
			return(n + sum(n-1));
	}

	/*public static int fib(int n){
		if(n==0)
			return(0);
		else if(n==1){
			return(1);
		}
		else{
			return(sum(n-1) + sum(n-2));
		}
	}

	public static String reverse(String s){
		int n = s.length();
		String x = s.substring(0,n-1);
		if(n==1)
			return(s);
		else
			s.substring(1) = s.substring(n) + x.reverse();

	}

	public static boolean isPalindrome(String s){
		int n = s.length();
		if ()
	}*/

	public static int reverseint(int n){
		String x = "";
		int y =0;
		int z = 0;
		if(n/10!=0)
			z = n/10;
			y = n%10;
			x += y + z.reverseint();
	}
}



package tt;

public class Math {
	static double pi =  3.141592653589793; //Defining static value for pi
	static int fact (int n) {// Defining static factorial integer
		return n <= 0?1 :n * fact(n-1);
	}
	public static double toDegrees(double x) {//Method to convert from Radians to Degrees
		double n;
		n = 180/pi;
		return n*x;
	}
	public static double toRadians(double x) {//Method to convert from Degrees to Radians
		double n;
		n = pi/180;
		return n *x;
	}
	public static double absoluteValue(double x) {// Method to find absolute value of number
		if (x<0) {
			return -1 * x;
		}
		else {
			return x;
		}
	}
	public static double minimum(double x , double y) {// Method to find minimum of two numbers
		if (x<y) {
			return x;
		}
		else {
			return y;
		}
	}
	public static double maximum(double x, double y) { // Method to find maximum of two numbers
		if (x>y) {
			return x;
		}
		else {
			return y;
		}
	}
	public static double power(double x, int y) { // Method to find the certain power of a number
		double n = 1;
		for(int i = y ; i> 0; --i) {
			n = n*x;
		}
		return n;
	}
	public static double root(double x, int y) { // Method to find the root of a number
		boolean doLoop = true;
		double gPrimed=0.0;
		double g = 1.0;
		while (doLoop) {
			gPrimed = g- (power(g,y)-x)/(y*power(g,y-1));
			if (absoluteValue(gPrimed - g) < 1.0E-10) {
				return gPrimed;
			}
			else {
				g = gPrimed;
			}
			
		}
		return gPrimed;
	}
	public static int gcd(int x, int y) { // Method to find the greatest common denominator
		int gcd=1;
		for (int i =1; i<=x && i<=y; i++) {
			if(x%i==0 && y%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	public static int lcm(int x, int y) {// Method to find the least common multiple
		int lcm = (x*y)/gcd(x,y);
		return lcm;
	}
	public static double sine(double x) {// Method to find the sine of a number
		double sin = 0;
		for (int i = 0;i<10; i++) {
			sin += power(-1,i)* power(x,2*i+1)/fact(2*i+1);
		}
		return sin;
	
	}
	public static double cosine(double x) {// Method to find the cosine of a number
		double cos = 0;
		for (int i = 0;i<10; i++) {
			cos += power(-1,i)* power(x,2*i)/fact(2*i);
		}
		return cos;
	
	}
	public static double tangent(double x) {// Method to find the tangent of a number
		double tan;
		tan = sine(x)/cosine(x);
		return tan;
	}
}

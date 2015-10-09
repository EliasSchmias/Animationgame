

	public class Ubung{
		 static double quadrat(double x) {
		 return x*x;}
		 
		 
	
		 static int fac(int i) {
			 return i==0?1:i*fac(i-1);
			 
	
			 
			 }
			 
		 
	public static void main(String[] args) {
		
		System.out.println(quadrat(2));
		System.out.println(quadrat(2.5));
		System.out.println(quadrat(5));
		
		System.out.println("fac(11) = "+fac(11));
	
		}

	}




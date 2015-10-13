

	public class Ubung{
		 static double quadrat(double x) {
		 return x*x;}
		 
		 
	
		 static int fac(int i) {
			 return i==0?1:i*fac(i-1);}
			 
			 
			 static long fibonacci(long i){
					if(i<=0) {return 0;}
					else {
						if(i==1 || i==2){return 1;}
						else {return(fibonacci(i-2)+fibonacci(i-1));}
	
			 
			 }}
			 
		 
	public static void main(String[] args) {
		
		System.out.println(quadrat(2));
		System.out.println(quadrat(2.5));
		System.out.println(quadrat(5));
		
		System.out.println("fac(11) = "+fac(11));
	
		System.out.println (fibonacci(7));
		
		}
	

	}




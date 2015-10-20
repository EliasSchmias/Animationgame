
public class Main {
// http://stackoverflow.com/questions/19474186/egit-rejected-non-fast-forward
	public static void main(String[] args) {

			SimpleOval so1 = new SimpleOval (45,53);
			SimpleOval so2 = new SimpleOval (45,53);
			System.out.println(so1.equals(so2));
			System.out.println(so1);
			
			SimpleSquare sq1 = new SimpleSquare (44,32);
			SimpleSquare sq2 = new SimpleSquare (45,53);
			System.out.println(sq1.equals(sq2));
			System.out.println(sq1);
			
			SimpleRectangle sr1 = new SimpleRectangle (35,3);
			SimpleRectangle sr2 = new SimpleRectangle (45,53);
			System.out.println(sr1.equals(sr2));
			System.out.println(sr1);
			

			EquilateralTriangle et1 = new EquilateralTriangle (75,5);
			EquilateralTriangle et2 = new EquilateralTriangle (45,53);
			System.out.println(et1.equals(et2));
			System.out.println(et1);
		
			
			Geometricobject o1 = new Geometricobject(17,4, new Vertex(42,23));
			Geometricobject o2 = new Geometricobject(17,4);
			Geometricobject o3 = new Geometricobject(17);
			Geometricobject o4 = new Geometricobject();
			
			
			System.out.println(o1.equals(o2));
			o2.moveTo(42,23);
			System.out.println(o1.equals(o2));
			System.out.println(o3.contains(new Vertex(10,3)));
			System.out.println(o4);

/*				
			Vertex v1 = new Vertex(10, 13);
			Vertex v2 = new Vertex(11, 13);
			v2.normalize(); 
			System.out.println(v2.x);
*/		
	
	}

}



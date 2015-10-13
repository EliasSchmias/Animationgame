
public class TestGeometricobject {
	public static void main(String[] args) {
		Geometricobject o1 = new Geometricobject(17,4, new Vertex(42,23));
		Geometricobject o2 = new Geometricobject(17,4);
		Geometricobject o3 = new Geometricobject(17);
		Geometricobject o4 = new Geometricobject();
		
		System.out.println(o1.equals(o2));
		o2.moveTo(42,23);
		
		
		
	}
}


public class EquilateralTriangle extends Geometricobject {
	
	public EquilateralTriangle(double w, double h, Vertex pos){
		super(w, h, pos);
	}
	
	public EquilateralTriangle(double w, double h, double x, double y){
		super(w,h, new Vertex(x,y));
	}
	
	public EquilateralTriangle(double w, double h){
		super(w,h,new Vertex(0,0));
	}

	@Override public double area(){
		return width*height/2;}
	

	
	public @Override String toString(){
		return "EquilateralTriangle("+super.toString()+")";}
	
	public @Override boolean equals(Object that){
		return (that instanceof EquilateralTriangle) && super.equals(that);
	}

}
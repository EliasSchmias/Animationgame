
public class SimpleRectangle extends Geometricobject {
	
	public SimpleRectangle(double w, double h, Vertex pos){
		super(w, h, pos);
	}
	
	public SimpleRectangle(double w, double h, double x, double y){
		super(w,h, new Vertex(x,y));
	}

	@Override public double area(){
		return width*height;}
	

	
	@Override public String toString(){
		return "SimpleRectangle("+super.toString()+")";}
	public @Override boolean equals(Object that){
		return (that instanceof SimpleRectangle) && super.equals(that);
	}

}

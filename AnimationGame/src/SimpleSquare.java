
public class SimpleSquare extends Geometricobject {
	
	public SimpleSquare(double w, Vertex pos){
		super(w, w, pos);
	}
	
	public SimpleSquare(double w, double h, double x, double y){
		super(w,w, new Vertex(x,y));
	}

	@Override public double area(){
		return height*height;}
	

	
	@Override public String toString(){
		return "SimpleSquare("+super.toString()+")";}
	public @Override boolean equals(Object that){
		return (that instanceof SimpleSquare) && super.equals(that);
	}

}

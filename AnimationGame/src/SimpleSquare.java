
public class SimpleSquare extends Geometricobject{

		public SimpleSquare(double w, Vertex pos){
				super(w, w, pos);
			}
			
			public SimpleSquare(double w,double x,double y) {
				super (w, w, new Vertex (x, y)) ;
			}
			
			public SimpleSquare(double w){
				super(w,w,new Vertex(0,0));
			}
			public SimpleSquare(int w, int i) {}
			@Override public double area() {
				return width*width;
			}
			
			public @Override String toString(){
				return "SimpleSquare("+super.toString()+")";
			}
			
			public @Override boolean equals(Object that){
				return (that instanceof SimpleSquare) && super.equals(that);
			}
		

	}
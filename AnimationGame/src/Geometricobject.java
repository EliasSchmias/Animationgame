
public class Geometricobject {
	
	public Vertex pos;
	public double height;
	public double width;
	
	public Geometricobject(double w, double h, Vertex pos){
		this.pos=pos;
		this.width=width;
		this.height=height;
		
		if(this.width<0){
			this.width = -this.width;
			pos.x = pos.x -this.width;
			
		}
		if(this.height<0){
			this.height = -this.height;
			pos.y = pos.y -this.height;
		}	}
	
	public Geometricobject(double width, double height){
		this(width, height, new Vertex(0,0));
	}
	
	public Geometricobject(double width){this(width,width);}
		
	public Geometricobject(Vertex pos){this(0,0,pos);}
	
	public double getwidth(){return width;};
		
	public double getheight(){return height;};
	
	public Vertex getpos(){return pos;};
	
	public String tostring(){
		return "width= " +width+", height="  +height+", pos=" +pos; 
	}

	public double circumference(){return 2*(width+height);}
	
	public double area(){return width*height;}
	
	public boolean contains(Vertex v){
		return v.x >=pos.x && v.x <=pos.x+width
		&&v.y >= pos.y && v.y <=pos.y+height;
	}

	public boolean isLargerthan(Geometricobject that){
		return this.area()>that.area();
		
	}

	public void moveTo(Vertex pos){this.pos=pos;}

	public void moveTo(double x; double y){
		moveTo(new Vertex(x,y))}
	}

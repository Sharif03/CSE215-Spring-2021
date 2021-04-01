package theoryLec12_OOPWithNestedClass_Inheritence_ThisAndSuper;

public class InheritenceConceptDiscussion {

	public static void main(String[] args) {
		String value = "20";
		int v = Integer.parseInt(value);
		
		
		Rectangle r2 = new Rectangle("Rectangle", 2.7 , 3.9);
		r2.area();
		
		Square s2 = new Square("Square", false, 5);
		s2.area();
		
		Circel c2 = new Circel("Circel", true, 3.3);
		c2.area();
		
		/*
		Rectangle r1 = new Rectangle();
		r1.length = 5.3;
		r1.width = 2.3;
		r1.setShapeName("Rectangle");
		r1.setColored(true);
		r1.area();
		
		Square s1 = new Square();		
		s1.length = 5.3;
		s1.setShapeName("Square");
		s1.setColored(false);
		s1.area();
		
		Circel c1 = new Circel();		
		c1.radious = 5.3;
		c1.setShapeName("Circel");
		c1.setColored(true);
		c1.area();
		*/

	}
	
}
class GeometricShape {
	private String shapeName;
	private boolean isColored;
	
	public GeometricShape(){
		
	}
	public GeometricShape(String shapeName) {
		this.shapeName = shapeName;
	}
	public GeometricShape(boolean isColored) {
		this.isColored = isColored;
	}
	public GeometricShape(String shapeName, boolean isColored) {
		this.shapeName = shapeName;
		this.isColored = isColored;
	}


	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	public boolean isColored() {
		return isColored;
	}
	public void setColored(boolean isColored) {
		this.isColored = isColored;
	}

	// Overriding
	public void area() {
		System.out.println("Area is: Nothing");
	}
}

// Inheritance[Is-Relation]
// Super()/ super. / super. 
// Overriding


class Rectangle extends GeometricShape {
	double length;
	double width;
	
	public Rectangle() {
		String sn = super.getShapeName();
	}
	public Rectangle(String shapeName, double length, double width) {
		super(shapeName);
		this.length = length;
		this.width = width;
	}

	public Rectangle(String shapeName, boolean isColored, double length, double width) {
		super(shapeName, isColored);
		this.length = length;
		this.width = width;
	}

	// Overriding
	public void area() {
		System.out.println("Area is: " + (length*width));
	}
	
	
}

class Square extends GeometricShape {
	double length;
	
    public Square() {
		
	}
    public Square(String shapeName, boolean isColored, double length) {
    	super(shapeName, isColored);
		this.length = length;
	}
    
    // Overriding
	public void area() {
    	System.out.println("Area is: " + Math.pow(length, 2));
    }	
}
class Circel extends GeometricShape {
	double radious;
	
	public Circel() {
		
	}
    public Circel(String shapeName, boolean isColored,  double radious) {
    	super(shapeName, isColored);
		this.radious = radious;
	}
    

    // Overriding
	public void area() {
    	System.out.println("Area is: " + Math.PI* Math.pow(radious, 2));
    }	
}



class Point extends GeometricShape {
	double x1;
	double y1;
	double x2;
	double y2;
	
    public void distence() {
    	double result = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    	System.out.println(result);
    }	
}


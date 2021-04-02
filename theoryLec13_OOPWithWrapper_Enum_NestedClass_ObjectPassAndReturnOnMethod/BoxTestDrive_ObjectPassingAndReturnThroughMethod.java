package theoryLec13_OOPWithWrapper_Enum_NestedClass_ObjectPassAndReturnOnMethod;

public class BoxTestDrive_ObjectPassingAndReturnThroughMethod {

	public static void main(String[] args) {
		Box b1 = new Box(2, 3, 4);
		Box b2 = new Box(4, 6, 8);
		Box b = b2.equalTo(b1);
		
		
		//(121)equalTo(324)
		
		System.out.println(b.getWidth());  

		System.out.println(b.getHeight()); 
		
		System.out.println(b.getDepth()); 
		
	}

}

class Box {
	private double width;
	private double height;
	private double depth;
	
	public Box() {
		
	}
	public Box equalTo(Box box) {
		if(width>box.width && height>box.height && depth>box.depth) {
			width = width + 5;
			height = height + 5;
			depth = depth + 5;
			Box newBox = new Box(width, height, depth);
			return newBox;	
		}	
		else {
			box.width = box.width + 10;
			box.height = box.height + 10;
			box.depth = box.depth + 10;
			return box;
		}	
	}

	public Box(double len) {
		// width = height = depth = len;	
		width = len;
		height = len;
		depth = len;	
	}
	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public void setDim(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double volume() {
		double result = this.width * this.height * this.depth;
		return result;
	}
	@Override
	public String toString() {
		String details =  "Width=" + width + ", Height=" + height + ", Depth=" + depth;
		return details;
	}
	   
}

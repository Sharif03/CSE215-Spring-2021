package theoryLec10_OOPWithEncapsulation;

public class Box {
	private double width;
	private double height;
	private double depth;
	
	public Box() {
		
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

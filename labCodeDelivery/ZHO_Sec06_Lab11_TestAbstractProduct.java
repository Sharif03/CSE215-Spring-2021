package labCodeDelivery;

import java.util.ArrayList;

public class ZHO_Sec06_Lab11_TestAbstractProduct {


	public static void main(String[] args) {
		Product p1 = new ElectronicDevice("Asus", 1000, "Zenbook", "6 Months");
		
		ClothingItem p2 = new ClothingItem("Zara", 200, "Cotton");
		ElectronicDevice p3 = new ElectronicDevice("dell", 1200, "Xps", "8 Months");
		
		
		p2.changePrice(10);
		p3.changePrice(10);
		ElectronicDevice e1 = (ElectronicDevice)p1;
		e1.setWarranty("8 Months");
		System.out.println(e1.getWarranty());
		
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		
		
		for(int i=0;i<3;i++) {
			System.out.println(productList.get(i).toString());
		}
	}

}


abstract class Product{
	private String name;
	private double price;
	
	protected Product(String name, double price) {
		this.name=name;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void changePrice(double percentage);
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}

class ClothingItem extends Product{
	String fabricType;

	public ClothingItem(String name, double price, String fabricType) {
		super(name, price);
		this.fabricType=fabricType;
	}

	public String getFabricType() {
		return fabricType;
	}

	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}

	public void changePrice(double percentage) {
		System.out.println(getPrice() - percentage);	
	}

	@Override
	public String toString() {
		return "ClothingItem [fabricType=" + fabricType + "]";
	}
}

class ElectronicDevice extends Product{
	private String model;
	private String warranty;
	
	public ElectronicDevice(String name, double price, String model, String warranty) {
		super(name,price);
		this.model=model;
		this.warranty=warranty;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String newModel) {
		this.model = newModel;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String newWarranty) {
		this.warranty = newWarranty;
	}
	@Override
	public void changePrice(double percentage) {
		System.out.println(getPrice() + percentage);	
	}

	@Override
	public String toString() {
		return "ElectronicDevice [model=" + model + ", warranty=" + warranty + "]";
	}
	
}









package theoryLec11_OOPWithMethod;

public class InstenceVariable {
	public String food = "I'm eating Rice";
	
	InstenceVariable() {}
	
	public static void main(String[] args) {
		InstenceVariable diba = new InstenceVariable();
		InstenceVariable fahim = new InstenceVariable();
		InstenceVariable mehedi = new InstenceVariable();
		InstenceVariable oishyee = new InstenceVariable();
		InstenceVariable zian = new InstenceVariable();
		
		
		
		 System.out.println(diba.food);  // I'm eating Rice
		 System.out.println(fahim.food); // I'm eating Rice
		 System.out.println(mehedi.food); // I'm eating Rice 
		 System.out.println(oishyee.food); // I'm eating Rice
		 System.out.println(zian.food); // I'm eating Rice
		 
		
		diba.food = "I'm eating Kacci";  // I'm eating Kacci
		System.out.println(diba.food);   // I'm eating Kacci
		System.out.println(fahim.food);  // I'm eating Kacci
		System.out.println(mehedi.food); // I'm eating Kacci
		System.out.println(oishyee.food); // I'm eating Kacci
		System.out.println(zian.food);  // I'm eating Kacci
		
		fahim.food = "I'm eating Shik kabab";
		System.out.println(diba.food);
		System.out.println(fahim.food);
		System.out.println(mehedi.food);
		System.out.println(oishyee.food);
		System.out.println(zian.food);
		
		mehedi.food = "I'm eating burgar";
		System.out.println(diba.food);
		System.out.println(fahim.food);
		System.out.println(mehedi.food);
		System.out.println(oishyee.food);
		System.out.println(zian.food);
		
		oishyee.food = "I'm eating pani puri";
		System.out.println(diba.food);
		System.out.println(fahim.food);
		System.out.println(mehedi.food);
		System.out.println(oishyee.food);
		System.out.println(zian.food);
		
		zian.food = "I'm eating cake";
		System.out.println(diba.food);
		System.out.println(fahim.food);
		System.out.println(mehedi.food);
		System.out.println(oishyee.food);
		System.out.println(zian.food);	
	}
}

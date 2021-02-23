package theoryLec01;

public class TypeCasting_ExplicitlyANDImplicitly {

	public static void main(String[] args) {
		byte byteNumber = 24;
		int intNumber = byteNumber;
		long longNumber = intNumber;
		longNumber = byteNumber;
		
		
		short a = 10;
		byte b = (byte)a;
		
		
		int aa = 20;
		short bb = (byte)aa;
		
		
		int aaa = 10;   // 4 byte
		float f = aaa;  // 4 byte
		aaa = (int)f;
		
		float ff = 22.1F;
		
		double dd = 23.3D;
		float fff = (float)dd;
		
				
		
		
		
				


	}

}

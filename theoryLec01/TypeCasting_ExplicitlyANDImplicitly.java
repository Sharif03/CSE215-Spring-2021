package theoryLec01;

public class TypeCasting_ExplicitlyANDImplicitly {

	public static void main(String[] args) {
		// Type casting Explicitly & Implicitly or Type conversion
		
		byte b1 = 10;  // 1 byte = 8 bit
		int i1 = b1;   // 4 byte = 32 bit  [Implicitly]
		b1 =  (byte)i1; // Explicitly 
		
		
		
		byte byteNumber = 24;
		int intNumber = byteNumber;
		long longNumber = intNumber;
		longNumber = byteNumber;
		
		
		short a = 10;      // Short = 2 byte 
		byte b = (byte)a;  // Byte = 1 byte
		
		
		int aa = 20;           // Int = 4 byte
		short bb = (short)aa;  // Short = 2 byte 
		
		
		int aaa = 10;   // Int   = 4 byte
		float f = aaa;  // Float = 4 byte 
		aaa = (int)f;
		
		float ff = 22.11F;
		  
		double dd = 23.3;       // Double = 8 byte
		float fff = (float)dd;  // Float = 4 byte 
		
				
		
		
		byte bValue = 30;
		int iValue = bValue;
		float fValue = bValue;
		fValue = iValue;
		
		iValue = (int) fValue;
		System.out.println(iValue);
		
		bValue = (byte)iValue;
		bValue = (byte)fValue;
		
	}

}

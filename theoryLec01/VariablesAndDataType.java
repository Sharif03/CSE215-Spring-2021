package theoryLec01;

public class VariablesAndDataType {

	public static void main(String[] args) {
		// Data Type && Range
		
		byte b = (byte)1000;  // 1000 - 256
		System.out.println(b);
		
		short s = (short)32768; // 32768 - 65536
		System.out.println(s);
		
		
		int bValue = 214748368;
		System.out.println(bValue);
		
		// Primitive Data Type:
		// byte(1 byte = 8 bit)  =  2^8 = 256/2 = 128[-128 to  +127]=> -2^7 to +2^7-1
		// short(2 Byte = 16 bit) = 2^16 = 65536/2 = 32768[-32768 to +32767]=> -2^15 to +2^15-1
		// int(4 byte = 32 bit) = 2^32 = 4294967296/2 = 2147483648[-2147483648 to +2147483647]=> -2^31 to +2^31-1
		// long(8 byte = 64 bit) = 
		// float(4 byte = 32 bit) =
		// double(8 byte = 64 bit) = 
		// char(2 byte = 16 bit) =  2^16 = 65536[0 to +65535]=> 
		char ch = 'A' + 25;
		System.out.println(ch);
		
		// boolean(true=1 / false=0), 
		boolean b1 = true;
		System.out.println(b1); 
		if(b1)
			System.out.println("Block a");
		else
			System.out.println("Block b");
		
		
		// User defined/ Object Type: String
		String str = "Hello";  // 10 byte 
		
		byte byteType = (byte)1000;   // 2^8  = 256  [0-127 positive] [-128 -1 negative] // -128 to +127
		//System.out.println(byteType);
		
		short shortType = (short)1000;   // 2^16  = 65536  [0-32767 positive] [-32768 -1 negative] // -32768 to +32767
		                                            
		//System.out.println(byteType);
		
		// Variable [name, dataType-size, value]
		int a = 10;   
		//System.out.println(a);
		

	}

}

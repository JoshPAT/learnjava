
public class Binaryopeator {

	public static void main(String[] args) {
		int a = 0x1100;
		int b = 2;
		print("a  ",a);	
		
	}
	static void print(String prefix, int n) {
		String s = Integer.toBinaryString(n);
		System.out.println(s);
	}
}

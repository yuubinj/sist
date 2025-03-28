package ch06.unit03;

public class Ex12 {

	public static void main(String[] args) {
		Test12 t = new Test12();
		int n;
		
		n = t.gcd(12, 8);
		System.out.println(n); // 4

		n = t.gcd2(12, 8);
		System.out.println(n); // 4
		
	}

}

class Test12{
	// 최대공약수
	public int gcd(int a, int b) {
		int mod = a % b;
		while(mod > 0) {
			a = b;
			b = mod;
			mod = a % b;
		}
		
		return b;
	}
	
	// 최대공약수
	public int gcd2(int a, int b) {
		return b==0 ? a: gcd2(b, a%b);
	}
}
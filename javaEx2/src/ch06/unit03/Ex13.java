package ch06.unit03;

public class Ex13 {

	public static void main(String[] args) {
		Test13 t = new Test13();
		
		t.print(3);
	}

}

class Test13{
	public void print(int n) {
		System.out.println("start : " + n);
		
		if(n > 1) {
			print(n-1);
			print(n-1);
		}
		
		System.out.println("end : " + n);
	}
}
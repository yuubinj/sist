package ch06.unit03;

public class Ex11 {

	public static void main(String[] args) {
		Test11 t = new Test11();
		
		int s;
		s = t.sum(10);
		System.out.println("결과 : " + s);

		System.out.println("2의 10승 : " + t.pow(2, 10)); // 1024
		System.out.println("2의 -2승 : " + t.pow(2, -2)); // 0.25

	}

}

class Test11{
	/*
	public int sum(int n) {
		int s = 0;
		for(int i=1; i<=n; i++) {
			s += i;
		}
		return s;
	}
	*/
	
	public int sum(int n) {
		return n > 1 ? sum(n-1) + n : 1;
	}
	
	// x의 y승 구하기
	public double pow(int x, int y) {
		/*
		// y가 0이상만 가능
		return y == 0 ? 1 : x * pow(x, y-1);
		*/
		
		if(y>=0) {
			return y == 0 ? 1 : (double)x * pow(x, y-1);	
		} else {
			return (1.0 / x) * pow(x, y+1);
		}
		
	}
}
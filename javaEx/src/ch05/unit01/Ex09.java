package ch05.unit01;

public class Ex09 {

	public static void main(String[] args) {
		// 4380원을 지불하기 위해 필요한 500,100,50,10원 동전 개수
		
		int []unit;
		unit = new int[] {500, 100, 50, 10};
		
		int money = 4380;
		System.out.println("금액 : " + money);
		System.out.println("동전\t개수");
		for(int n:unit) {
			System.out.println(n + "원\t" + (money/n));
			money %= n;
		}
		
	}

}

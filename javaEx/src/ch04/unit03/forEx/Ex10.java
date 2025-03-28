package ch04.unit03.forEx;

public class Ex10 {

	public static void main(String[] args) {
		
		// for 문에서는 float 을 증감변수로 사용하면 안된다.
		int start = 2000000000;
		int count = 0;
		for(float f = start; f < start + 50; f++) {
			count++;
		}
		System.out.println("결과 : " + count); // 0
		// float 에서는 2000000000 와 2000000050이 같다고 나오기 때문에 for 루프로 들어가지 않음.

		// 부정확한 부동소수점의 연산
		double a = 0;
		a = 4.7;
		a += 0.4;
		System.out.println(a); // 5.1000000000000005
		System.out.println(a == 5.1); // false
		
		// 소수점 이하는 잘림 현상이 일어나기 때문에 정확하지 않다. double 이 float 보다 낫지만 여전히 부정확.
		
	}

}

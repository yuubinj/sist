package ch05.unit01;

/*
  - 배열은 크기를 변경할 수 없다.
  - 배열의 크기를 변경하면 이전 배열 위치를 참조할 수 없어(이전 주소 찾을 수 없음.)
  	이전 배열은 가비지컬렉터(garbage collector)의 대상이 되며
  	새로운 배열을 만든다.
 */
public class Ex03 {

	public static void main(String[] args) {
		int [] a = new int[3];
		a[0] = 10; a[1] = 20; a[2] = 30;
		
		System.out.println("배열의 크기를 3으로 설정하고 값을 할당 후...");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " "); // 10 20 30
		}
		System.out.println();
		
		a = new int[5];
		a[3] = 40; a[4] = 50;
		System.out.println("\n배열의 크기를 5로 변경한 경우...");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " "); // 0 0 0 40 50
		}
		System.out.println();
		
	}

}

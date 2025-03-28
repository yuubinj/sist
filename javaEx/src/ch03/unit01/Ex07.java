package ch03.unit01;

public class Ex07 {

	public static void main(String[] args) {
		String s;
		
		// String + : 문자열 결합
		s = "korea" + 9 + 3;
		System.out.println(s); // "korea93"
		
		s = 9 + 3 + "korea";
		System.out.println(s); // "12korea"
		
		s = '0' + 3 + "korea";
		System.out.println(s); // "51korea"
		
		s = 'A' + 3 + "korea";
		System.out.println(s); // "68korea"
				
		s = 'A' + "korea" + 3;
		System.out.println(s); // "Akorea3"
		
		s = "korea" + 3 + 'A';
		System.out.println(s); // "korea3A"

	}

}

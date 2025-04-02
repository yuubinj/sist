package ch07.unit04;

public class Ex12 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		System.out.println("기본버퍼크기 : " + sb.capacity());
				// 16
		
		sb.append("seoul"); // 뒤에 문자열 추가
		sb.append("korea");
		sb.append("우리나라");
		sb.append("대한민국");
		System.out.println(sb);
		System.out.println("버퍼크기 : " + sb.capacity());
				// 34
		
		System.out.println("문자열 길이 : " + sb.length());
				// 18
		
		System.out.println("korea 위치 : " + sb.indexOf("korea"));
				// 5
		
		String s = sb.toString(); // 문자열로 변환
		System.out.println(s.toUpperCase());
		// System.out.println(sb.toString().toUpperCase());
			// 대문자로 변환은 String 으로 변환 후 해야 함.
		
		// seoul 앞에 한국 insert
		sb.insert(0, "한국");
		System.out.println("seoul 앞에 한국 추가 후 : " + sb);
		
		// korea 앞에 "서울" 추가
		sb.insert(sb.indexOf("korea"), "서울");
		System.out.println("korea 앞에 서울 추가 후 : " + sb);
		
		// korea 뒤에 "사랑" 추가
		// sb.insert(sb.indexOf("korea") + 5, "사랑");
		sb.insert(sb.indexOf("korea") + "korea".length(), "사랑");
		System.out.println("korea 뒤에 사랑 추가 후 : " + sb);
		
		// "우리나라" 삭제
		// delete(s, e) : s 인덱스에서 e-1 인덱스까지 삭제
		sb.delete(sb.indexOf("우리나라"), sb.indexOf("우리나라") + "우리나라".length());
		System.out.println("우리나라 삭제 후 : " + sb);
		
		System.out.println("버퍼크기 : " + sb.capacity()); // 34
		sb.trimToSize(); // 버퍼크기를 문자열 길이로 변경
		System.out.println("버퍼크기 : " + sb.capacity()); // 20
		
		// 모든 문자열 지우기
		sb.delete(0, sb.length());
		System.out.println("삭제 후 : " + sb);
	}

}

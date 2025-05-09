package ch14.unit02;

public class Ex01_InputStream {

	public static void main(String[] args) {
		int data;
		char ch;
		
		/*
		  - System.in : InputStream 객체. byte 스트림
		  - InputStream 의 read() : 1byte 문자를 읽어 ASCII 코드 반환
		  - ABC엔터 => 65 66 67 13 10
		  - 대한엔터(UTF8) => 235 140 128 237 149 156 13 10
		  - UTF8에서 한글은 3byte
		  
		  - OutputStream의 write(int) : 하위 1byte 출력
		 */
		
		try {
			System.out.print("문자열[Ctrl+Z:종료] ? "); // 13+10 = Enter
			while((data = System.in.read()) != -1) { // 1바이트를 읽어서 그것의 ASCII 코드 값 반환
				// System.out.println(data);
				ch = (char)data;
				// System.out.print(ch); // 2바이트를 출력 - 한글 깨짐. 1바이트로 읽어서 2바이트로 출력하려 해서 깨진다.
					// 한글은 깨짐. 2byte(3byte) 문자를 1byte만 읽어서 2byte로 출력했기 때문에.
				
				System.out.write(ch); // 1바이트만 출력. 1바이트로 읽어서 1바이트로 출력해서 깨지지 않는다.
					// 한글 깨지지 않음. 하위 1byte만 출력
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

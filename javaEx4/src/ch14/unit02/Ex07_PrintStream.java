package ch14.unit02;

import java.io.PrintStream;

public class Ex07_PrintStream {

	public static void main(String[] args) {
		// - System.out : PrintStream 객체
		// - PrintStream
		//   : 다양한 출력이 가능한 출력 스트림(필터 스트림)
		//   : IOException 이 발생되지 않음.
		// OutputStream > FilterOutputStream > PrintStream
		
		PrintStream ps = System.out;
		ps.write(65); // 하위 1byte를 출력 버퍼로 보냄
		ps.write(66);
		ps.write(67);
		ps.flush();
		ps.println();
		// write()는 문자로만 출력된다.
		// OutputStream으로 출력할 수 있는 것은 write() 밖에 없다.
		// FilterOutputStream은 OutputStream이 더 다양한 것을 출력할 수 있도록(?) 만들어짐. 가공된 스트림.
		
		ps.print("X");
		ps.print("Y");
	}

}

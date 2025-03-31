package ch06.unit03;

// 비정형 인수(가변인수)
public class Ex16_varargs {

	public static void main(String[] args) {
		Test16 t = new Test16();
		
		int s = t.sum(1, 2);
		System.out.println(s);
		
		s = t.sum(1, 2, 3);
		System.out.println(s);
		
		s = t.sum(2, 4, 6, 8, 10);
		System.out.println(s);
		
	}

}

class Test16{
	public int sum(int ...args) {
		int s = 0;
		for(int n:args) {
			s += n;
		}
		/*
		 for(int i=0; i<args.length; i++){
		 	s += args[i];
		 }
		 */
		
		return s;
	}
}
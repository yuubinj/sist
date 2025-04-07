package ch08.unit06;

public class Ex05 {

	public static void main(String[] args) {
		Store st = new Store();
		
		Apple obj = new Apple();
		st.sell(obj);
		
		Fruit f = new Orange();
		st.sell(f);
		
		st.sell(new Apple());
	}
}

/*
  - 인터페이스 특징
 	: 클래스 간의 결합도를 낮출 수 있다.
	: 표준화가 가능하다.
	: 개발 시간을 단축할 수 있다.
*/

interface Fruit{
	public int getPrice();
	public String getName();
}

class Apple implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
}

class Orange implements Fruit{
	@Override
	public int getPrice() {
		return 700;
	}

	@Override
	public String getName() {
		return "오렌지";
	}
}

class Store{
	public void sell(Fruit ft) {
		System.out.println(ft.getName() + " -> " + ft.getPrice());
	}
}
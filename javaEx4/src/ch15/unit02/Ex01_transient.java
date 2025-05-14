package ch15.unit02;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex01_transient {

	public static void main(String[] args) {
		String pathname = "object2.txt";

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathname))) {
			oos.writeObject(new User("김자바", "010-111", 20)); // 객체는 주소를 가지고 있음. 객체의 주소는 항상 바뀜. // 그 주소에 있는 값을 저장해야 하는 것.
			oos.writeObject(new User("이자바", "010-222", 21));
			oos.writeObject(new User("다자바", "010-333", 19));

			System.out.println("파일 저장 완료...");

		} catch (Exception e) {
			e.printStackTrace();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathname))) {
			System.out.println("\n파일 내용");

			while (true) {
				User vo = (User) ois.readObject();
				System.out.println(vo.getName() + " : " + vo.getTel() + " : " + vo.getAge());
			}
		} catch (EOFException e) {
			// ObjectInputStream 에서 더이상 읽을 자료가 없으면 EOFException 예외 발생
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// Serializable : 객체를 직렬화 가능하도록 설정
// 직렬화 대상에서 제외되는 것 : 메소드, static 변수, transient 변수
class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private transient String tel; // transient - DB와 파일에 전송이 되지 않는다.
	private int age;

	public User() {

	}

	public User(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

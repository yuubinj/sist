package ch12.addr_m;

// 이름, 전화번호, 생년월일, 주소, 등록일
public class AddressVO {
	private String name;
	private String tel;
	private String birth;
	private String address;
	private String date;
	
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		String s = String.format("%s\t%s\t%s\t%s\t%s", name, tel, birth, address, date);
		return s;
	}
}

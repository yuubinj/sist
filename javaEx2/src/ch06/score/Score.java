package ch06.score;

public class Score {
	private ScoreVO[] list;
	private int count;
	
	public Score() {
		count = 0;
		// 생성자
		// list = new ScoreVO[5]; // ScoreVO 객체를 5개 저장
		allocation(5); // 초기에 5개의 배열 생성
	}
	
	// 배열의 메모리 할당.
	private void allocation(int capacity) {
		ScoreVO[] temp = new ScoreVO[capacity];
		
		if(list != null && count> 0) {
			System.arraycopy(list, 0, temp, 0, count);
		}
		
		// 전에 가리키고 있는 list의 주소는 메모리가 회수되고
		//  새롭게 할당받은 temp를 list가 가지고 있다.
		list = temp;
	}
	
	// 배열에 ScoreVO 객체를 추가
	public int append(ScoreVO vo) {
		if(count >= list.length) {
			// 배열이 꽉 찼으면
			allocation(list.length + 5); // 배열의 크기를 5개 늘림
		}
		
		list[count++] = vo;
		
		return count; // 추가 후 전체 인원수 반환
	}
	
	// 등록된 전체 인원수
	public int getCount() {
		return count;
	}
	
	public ScoreVO[] findByAll() {
		return list;
	}
	
	public ScoreVO findByHak(String hak) {
		/*
		 - 자바에서 문자열을 비교
		   : 문자열을 비교할 때는 equals() 메소드를 이용하여 비교한다.
		   : 문자열을 비교할 때 == 으로 비교하면 문자열을 비교하는 것이
		     아니라 문자열이 저장된 주소를 비교한다.
		 */
		for(int i=0; i<count; i++) {
			ScoreVO vo = list[i];
			if(vo.getHak().equals(hak)) {
				return vo;
			}
		}
		
		return null; // 메모리를 할당 받지 않은 상태. 초기값이 null 이긴 함.
	}
	
	public boolean deleteScore(ScoreVO vo) {
		if(vo == null || count == 0) {
			return false;
		}

		for(int i=0; i<count; i++) {
			if(list[i] == vo) {
				deleteScore(i);
				
				return true;
			}
		}
	
		return false;
	}
	
	public void deleteScore(int index) {
		if(index < 0 || index >= count) {
			return;
		}
		
		for(int i=index+1; i<count; i++) {
			list[i-1] = list[i];
		}
		
		count--;
		list[count] = null;
	}
	
	public double grade(int score) {
		double s = 0.0;
		
		if(score>=95) s = 4.5;
		else if(score>=90) s = 4.0;
		else if(score>=85) s = 3.5;
		else if(score>=80) s = 3.0;
		else if(score>=75) s = 2.5;
		else if(score>=70) s = 2.0;
		else if(score>=65) s = 1.5;
		else if(score>=60) s = 1.0;
		else s = 0.0;
		
		return s;
	}
	
}

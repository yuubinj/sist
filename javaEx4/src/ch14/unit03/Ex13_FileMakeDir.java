package ch14.unit03;

import java.io.File;

public class Ex13_FileMakeDir {
	public static void main(String[] args) {
		String path = "C:" + File.separator + "ex" + File.separator + "test";
		
		try {
			File f = new File(path);
			
			if(f.exists()) {
				System.out.println("폴더가 존재합니다.");
			}
			
			// 폴더 만들기 : 상위 폴더가 없는 경우 상위 폴더도 생성
			f.mkdirs(); // 폴더가 존재하면 생성하지 않음
			
			// 주의 : mkdir() 은 상위 폴더가 없으면 폴더를 만들지 않음
			
			System.out.println("폴더 생성 완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

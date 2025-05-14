package ch14.unit03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Ex09_FileReader {

	public static void main(String[] args) {
		String pathname = "user.txt";
		File f = new File(pathname);
		
		// File 클래스 exists() 메소드 : 파일이 존재하면 true 반환 
		if(! f.exists()) {
			System.out.println(pathname + " 파일이 존재하지 않습니다.");
			System.exit(0);
		}
		
		String s;
		String name;
		int kor, eng, mat;
		
		// try(BufferedReader br = new BufferedReader(new FileReader(f))) { new InputStreamReader(new FileInputStream(f))을 합친 것이 FileReader(f)
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"))) { // MS949 // 바이트를 문자로 읽어서 BufferedReader로 읽는다.
			while((s = br.readLine()) != null) {
				String []ss = s.split(",");
				if(ss.length != 4) {
					continue; // 길이가 4가 아닌 것은 버리고, 다음 줄 읽기
				}
				name = ss[0].trim();
				kor = Integer.parseInt(ss[1].trim());
				eng = Integer.parseInt(ss[2].trim());
				mat = Integer.parseInt(ss[3].trim());
				System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + (kor+eng+mat));
			}
		} catch (NumberFormatException e) {
			System.out.println("점수가 숫자가 아닙니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

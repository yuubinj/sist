package ch14.unit03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileCopyEx02 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String source = null, dest = null;
		byte[] b = new byte[8192]; // 버퍼의 크기만큼 8192을 줌. 가장 효율적
		int len;
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			System.out.print("복사할 원본 파일 ? ");
			source = br.readLine();
			
			System.out.print("복사시킬 대상 파일명 ? ");
			dest = br.readLine();
			
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			
			while((len = fis.read(b)) != -1) { // len = 바이트 배열의 길이만큼 한번에 읽어냄(8192 만큼) // 8192만큼 읽지 못하면 진짜로 읽어낸 문자의 길이를 반환. 
				fos.write(b, 0, len); // 0번째 위치부터 읽어 들인 길이만큼만 저장
			}
			fos.flush();
			
			System.out.println("파일 복사 완료 !!!");
			
		} catch (FileNotFoundException e) {
			System.out.println(source + " 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
				}
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
				}
			}
		}

	}

}

package ch14.unit03;

import java.io.RandomAccessFile;

public class Ex18_RandomAccessFile {
	
	public static void main(String[] args) {
		// 원래 파일은 한번만 읽기가 가능한데, RandomAccessFile은 이곳저곳 원하는 곳을 읽을 수 있음.
		RandomAccessFile raf = null;
		
		try {
			// 읽고 쓰기가 가능한 랜덤파일 객체 생성
			raf = new RandomAccessFile("ex.txt", "rw");
			
			// 파일에 영문자 저장
			for(int i=65; i<=90; i++) {
				raf.write(i);
			}
			
			byte b;
			// 파일의 내용을 읽을 위치로 이동
			raf.seek(5);
			b = raf.readByte();
			System.out.write(b); // F
			
			raf.seek(10);
			b = raf.readByte();
			System.out.write(b); // K
			
			b = raf.readByte();
			System.out.write(b); // L
			
			System.out.flush();
			System.out.println();
			
			raf.seek(0);
			for(int i=0; i<(int)raf.length(); i++) {
				System.out.write(raf.readByte());
			}
			
			System.out.flush();
			System.out.println();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(raf != null) {
				try {
					raf.close();
				} catch (Exception e2) {
				}
			}
		}
	}
}

package ch16.unit01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class Ex02_HtmlViewer {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String host, s;
		
		BufferedReader wbr = null;
		
		try {
			System.out.print("웹주소[https://www.naver.com] ? ");
			host = br.readLine();
			
			// URL : 웹상의 리소스에 대한 포인트
			// URL url = new URL(host); // JDK 20 deprecated
			URL url = URI.create(host).toURL(); // JDK 20 이상
			InputStream is = url.openStream(); // 그 주소에서 입력 스트림을 가지고 온다. 바이트 스트림
			wbr = new BufferedReader(new InputStreamReader(is, "utf-8")); // 바이트 스트림을 BufferedReader로 바꿈. utf-8로 인코딩
			
			while((s = wbr.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(wbr != null) {
				try {
					wbr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}

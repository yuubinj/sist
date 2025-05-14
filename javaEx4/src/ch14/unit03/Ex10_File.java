package ch14.unit03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_File {

	public static void main(String[] args) {
		String appDir = System.getProperty("user.dir");
		System.out.println("현 작업 경로 -> " + appDir);
		
		String pathname = appDir + File.separator + "user.txt"; // OS에 따라 경로 구분자가 달라서 File.separator를 써준다.
		
		File f = new File(pathname);
		// exists() : 파일 또는 폴더가 존재하면 true 반환
		if(! f.exists()) {
			System.out.println(pathname + " 파일이 없습니다.");
			System.exit(0);
		}
		
		try {
			System.out.println("파일정보...");
			System.out.println("파일명 -> " + f.getName()); // 파일명.확장자
			System.out.println("경로명 -> " + f.getPath()); // C:\폴더\파일명.확장자
			System.out.println("절대경로명 -> " + f.getAbsolutePath()); // C:\폴더\파일명.확장자
			System.out.println("표준경로명 -> " + f.getCanonicalPath()); // C:\폴더\파일명.확장자
			System.out.println("부모경로명 -> " + f.getParent()); // C:\폴더
			System.out.println("파일길이(long) -> " + f.length()); // byte // 타입이 long
			System.out.println("파일생성일 -> " + new Date(f.lastModified()));
			
			// SimpleDateFormat 쓰면 원하는 형식으로 출력할 수 있다.
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String s = sdf.format(new Date(f.lastModified()));
			System.out.println("파일 생성일 -> " + s);
			
			// 읽기, 쓰기 권한
			System.out.println("파일 읽기 속성 -> " + f.canRead());
			System.out.println("파일 쓰기 속성 -> " + f.canWrite());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package a220405;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		
		FilenameFilter ff = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		File f = new File("src/a220405/FileEx1.java");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일 이름 : " + fileName);
		System.out.println("확장자를 제외한 파일 이름 : " + fileName.substring(0, pos));
		System.out.println("확장자 : " + fileName.substring(pos+1));
		
		System.out.println("경로를 포함한 파일 이름 : " + f.getPath());
		System.out.println("파일의 절대 경로 : " + f.getAbsolutePath());
		System.out.println("파일의 정규 경로 : " + f.getCanonicalPath());
		System.out.println("파일이 속해있는 디렉토리 : " + f.getParent());
		
		System.out.println(f.exists());
	}
}

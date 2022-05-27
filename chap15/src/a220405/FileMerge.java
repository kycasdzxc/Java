package a220405;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileMerge {
	public static void main(String[] args) throws Exception {
		String mergeFileName = "contract.html";
		
		File tempFile = File.createTempFile("~mergetemp", ".tmp");
//		tempFile.deleteOnExit();
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(tempFile));
		BufferedInputStream bis = null;
		
		int number = 1;
		
		File f = new File(mergeFileName + "_." + number);
		
		while(f.exists()) {
			f.setReadOnly(); // 작업중에 파일 변경 불가
			bis = new BufferedInputStream(new FileInputStream(f));
			int data = 0;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			bis.close();
			
			f = new File(mergeFileName + "_." + ++number);
		}
		bos.close();
		
		File oldFile = new File(mergeFileName);
		if(oldFile.exists()) {
			oldFile.delete();
			tempFile.renameTo(oldFile);
		}
	}
}

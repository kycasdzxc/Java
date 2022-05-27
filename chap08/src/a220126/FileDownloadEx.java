package a220126;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FileDownloadEx {
	public static void main(String[] args) {
		String url = "https://www.naver.com";
		String targetName = "naver.html";
		try {
			download(url, targetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void download(String url, String targatName) throws IOException {
		URL u = new URL(url);
		InputStream is = u.openStream();
		FileOutputStream fos = new FileOutputStream(targatName);
		int b = 0;
		while((b = is.read()) != -1) {
			fos.write(b);
		}
		fos.close();
	}
}

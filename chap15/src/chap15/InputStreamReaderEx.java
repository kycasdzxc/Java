package chap15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class InputStreamReaderEx {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.naver.com");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String s = null;
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
	}
}
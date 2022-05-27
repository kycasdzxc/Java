package chap13;

import javax.swing.JOptionPane;

public class ThreadEx7 extends Thread{
	public static void main(String[] args) throws InterruptedException {
		new ThreadEx7().start();
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + " 입니다.");
		
	}

	@Override
	public void run() {
		for(int i = 10 ; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

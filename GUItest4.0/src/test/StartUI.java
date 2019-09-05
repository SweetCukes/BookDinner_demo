package test;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StartUI extends JFrame{
	private JButton button;
	public void init() {
		this.setSize(550, 500);
		button = new JButton("5")	;
		button.setFont(new Font("",Font.BOLD,208));
		this.add(button);
		
		ButtonAction t = new ButtonAction();
		t.run();
		this.setUndecorated(true);
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(0);
		
		this.setLocationByPlatform(true);
		this.setLocation(410	, 165);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	class ButtonAction extends Thread{
		int num = 5;
		@Override
		public void run() {
			while (num != 0) {
				try {
					num--;
					button.setText(num+"");
					sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		StartUI frm = new StartUI()	;
		frm.init();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}

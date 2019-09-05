import java.awt.Graphics;

import javax.swing.JFrame;

public class Test2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Test2(){
		this.setTitle("九宫格");
		this.setSize(550, 550);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(false);
		this.setVisible(true);
	}
	
	public void paint(Graphics g) {
		for (int i = 0; i <10; i++) {
			g.drawLine(50,50+i*50,500,50+i*50);
		}
		for (int i = 0; i <10; i++) {
			g.drawLine(50+i*50,50,50+i*50,50+450);
		}
	}
	
	public static void main(String[] args) {
		new Test2();
	}
}



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public void init() {
		this.setTitle("测试");
		this.setSize(300, 250);
		this.setResizable(false);  //锁定大小
		this.setLocation(410,165);  //绝对坐标布局
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton JBT = new JButton();
		this.add(JBT);
		JBT.setText("测试");
		JBT.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					System.out.println("按钮点击");
			}
				
		});
		this.setVisible(true);
	}		
	@Override
	public void actionPerformed(ActionEvent e) {
			
			}

	public static void main(String[] args) {
		Test1 test = new Test1();
		test.init();
	}


	
}

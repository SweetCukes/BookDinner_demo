package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameUI extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel p2lb =null;
	public JLabel p1lb =null;
	public JButton jlb = null;
	public JButton stlb = null;
	public JButton blb = null;
	JLabel rstlb = null;
	private User user;
	private Computer computer;
	private Game game;
	private MyWindowListener myWindowListener;
	public GameUI() {
		
	}
	public void init(){
		
		//此处可以调用登录界面选择对战角色
		user = new User()	;
		computer = new Computer();
		game = new Game()	;
		this.setTitle("猜拳游戏");
		this.setSize(550,500); //大小
		this.setResizable(false);  //锁定大小
		this.setLocation(410,165);  //绝对坐标布局
		this.setLayout(null); //设计空布局
		
		
		JLabel m1lb1 = new JLabel();
		m1lb1.setIcon(new ImageIcon("src/test/m1.png"));
		m1lb1.setBounds(25, 40, 85, 80);
		this.add(m1lb1);
		
		JLabel m2lb1 = new JLabel();
		m2lb1.setIcon( new ImageIcon("src/test/m2.png"));
		m2lb1.setBounds(420, 40, 85, 80);
		this.add(m2lb1);
		
		JLabel vs1lb1 = new JLabel();
		vs1lb1.setIcon(new ImageIcon("src/test/vs1.png"));
		vs1lb1.setBounds(230, 45, 70, 45);
		this.add(vs1lb1);
		
		JLabel vslb1 = new JLabel();
		vslb1.setIcon(new ImageIcon("src/test/vs.png"));
		vslb1.setBounds(125, 255, 330, 190);
		this.add(vslb1);
		
		
		
		jlb = new JButton();
		jlb.setIcon( new ImageIcon("src/test/j.png"));
		jlb.setBounds(40, 150, 50, 50);
		this.add(jlb);
		
		stlb = new JButton();
		stlb.setIcon(new ImageIcon("src/test/q.png"));
		stlb.setBounds(40, 260, 50	, 50);
		this.add(stlb);
		
		blb = new JButton();
		blb.setIcon(new ImageIcon("src/test/b.png"));
		blb.setBounds(40, 370, 50, 50);
		this.add(blb);
		
		
		
		
		ImageIcon p1 = new ImageIcon("src/test/b.png");
		p1lb = new JLabel();
		p1lb .setIcon(p1);
		p1lb .setBounds(126, 46, 50, 50);
		this.add(p1lb );
		
		ImageIcon p2 = new ImageIcon("src/test/j.png");
		p2lb = new JLabel();
		p2lb .setIcon(p2);
		p2lb .setBounds(350, 46, 50, 50);
		this.add(p2lb );
		
		
		ImageIcon rst = new ImageIcon("src/test/h.png");
		rstlb = new JLabel();
		rstlb .setIcon(rst);
		rstlb .setBounds(160	, 130, 230, 125);
		this.add(rstlb );

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("保存用户数据");
				String data = "本轮成绩：" +user.score;
				String str = readData();
				
				try {
					File file = new File("/Users/ashikotakeshi/Desktop/guess");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write("用户成绩：" + user.score	);
					fileWriter.close();
					System.out.println("数据保存成功！");
				} catch (Exception e2) {
					// TODO: 记录日志
				}
			}
		});
		registerlistener();
	}
	public static String readData() {
		StringBuffer data = null;
		try {
			File file = new File("/Users/ashikotakeshi/Desktop/guess");
			if (!file.exists()) {
				return "上次成绩：0";
			}
			FileReader fr = new FileReader(file); //设定指定字符串长度进行读取
			char []cs = new char[20];
			data = new StringBuffer()	;
			int len = -1;
			while ((len = fr.read(cs))!= -1) {
				data.append(new String(cs,0,len));
			}
			System.out.println("文件内容为：" + data);
			fr.close();
		} catch (Exception e) {
			// TODO: 记录日志
		}
		return data.toString();
		
	}
	
	public void registerlistener(){
			jlb.addActionListener(this);
			blb.addActionListener(this);
			stlb.addActionListener(this);
			this.addWindowListener(new MyWindowListener());
		}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton cqbtn = (JButton)e.getSource();
		int perFirst = user.punches(this,cqbtn);
		
		int comFirst = computer.computeShowFirst();
		computerChange(comFirst);
		
		showResult(perFirst, comFirst);
		
	}

	private int punches(JButton cqbtn) {
		int perFirst = 0;
		if (cqbtn == jlb) {
			perFirst = 1;
			p1lb.setIcon(new ImageIcon("src/test/j.png"));
		}else if (cqbtn == stlb) {
			perFirst = 2;
			p1lb.setIcon(new ImageIcon("src/test/q.png"));
		}else if(cqbtn == blb){
			perFirst = 3;
			p1lb.setIcon(new ImageIcon("src/test/b.png"));
		}
		return perFirst;
	}
	
	private void computerChange(int comFirst) {
		switch (comFirst) {
		case 1:
			p2lb.setIcon(new ImageIcon("src/test/j.png"));
			break;
		case 2:
			p2lb.setIcon(new ImageIcon("src/test/j.png"));
			break;
		case 3:
			p2lb.setIcon(new ImageIcon("src/test/b.png"));
			break;
		}
	}

	private void showResult(int perFirst,int comFirst) {
		if (perFirst == comFirst) {
			rstlb .setIcon(new ImageIcon("src/test/z.png"));
				
		}else if ((perFirst == 1 && comFirst ==3)||
						(perFirst == 2 && comFirst ==1)||
							(perFirst == 3 && comFirst ==2)){
									user.score++;
								rstlb.setIcon(new ImageIcon("src/test/h.png"));
		}else  {
			rstlb.setIcon(new ImageIcon("src/test/w.png"));
			computer.score++;
		}
		System.out.println("用户得分："+user.score);
		System.out.println("电脑得分："+computer.score);
	}


	
	
}

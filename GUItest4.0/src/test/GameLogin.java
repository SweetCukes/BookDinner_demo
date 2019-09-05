package test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GameLogin {

	public static void main(String[] args) {
		JFrame j = new JFrame("游戏登录");
		j.setSize(280,135);
		JLabel labuser = new JLabel("用户名");
		JLabel labpass = new JLabel("密码");
		JTextField txtuser = new JTextField()	;
		JPasswordField txtpass = new JPasswordField()	;
		JButton btnlogin = new JButton();
		JButton btncancel = new JButton();
		
		//布置窗口
		JPanel panInput = new JPanel();
		panInput.setLayout(new GridLayout(2,2));
		panInput.add(labuser);
		panInput.add(labpass);
		panInput.add(txtuser);
		panInput.add(txtpass);
		
		//布置按钮
		JPanel panButton = new JPanel();	
		panButton.setLayout(new FlowLayout());
		panButton.add(btnlogin);
		panButton.add(btncancel);
		
		//布置窗体
		j.setLayout(new BorderLayout());
		//设置窗口出现的位置
		j.setLocationByPlatform(true);
		j.setLocation(460, 175);
		j.add(panInput,BorderLayout.CENTER);
		j.add(panButton,BorderLayout.SOUTH);
	}
}

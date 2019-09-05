package test;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.zip.ZipEntry;

import javax.swing.JOptionPane;
/*
 * 
 */
public class MyWindowListener extends WindowAdapter{
	private String result= "";
	public MyWindowListener() {
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		GameUI gameUI = (GameUI)e.getSource();     
		JOptionPane.showConfirmDialog(null, result);
	}
}

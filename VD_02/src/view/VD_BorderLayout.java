package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VD_BorderLayout extends JFrame {
	public VD_BorderLayout() {
		this.setTitle("BorderLayout");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
		BorderLayout borderLayout1 = new BorderLayout();
		BorderLayout borderLayout2 = new BorderLayout(50, 50);
		
		//this.setLayout(borderLayout1);
		this.setLayout(borderLayout2);
	
		
		
		JButton jButton1 = new JButton("1");
		JButton jButton2 = new JButton("2");
		JButton jButton3 = new JButton("3");
		JButton jButton4 = new JButton("4");
		JButton jButton5 = new JButton("5");
		
		this.add(jButton1, BorderLayout.NORTH);
		this.add(jButton2, BorderLayout.SOUTH);
		this.add(jButton3, BorderLayout.WEST);
		this.add(jButton4, BorderLayout.EAST);
		this.add(jButton5, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new VD_BorderLayout();
	}
}

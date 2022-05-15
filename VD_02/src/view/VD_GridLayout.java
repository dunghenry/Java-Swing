package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VD_GridLayout extends JFrame {
	public VD_GridLayout() {
		this.setTitle("GridLayout");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
		GridLayout gridLayout1 = new GridLayout();
		GridLayout gridLayout2 = new GridLayout(4, 4);
		GridLayout gridLayout3 = new GridLayout(4, 4, 25, 25);
		
		//this.setLayout(gridLayout1);
		this.setLayout(gridLayout2);
		//this.setLayout(gridLayout3);
		
//		JButton jButton1 = new JButton("button");
//		JButton jButton2 = new JButton("button");
//		JButton jButton3 = new JButton("button");
		
		for(int i = 0; i < 16; i++) {
			JButton jButton = new JButton(i + "");
			this.add(jButton);
		}
		
//		this.add(jButton1);
//		this.add(jButton2);
//		this.add(jButton3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new VD_GridLayout();
	}
}

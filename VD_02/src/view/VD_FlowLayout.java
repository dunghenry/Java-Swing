package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VD_FlowLayout extends JFrame{
	public VD_FlowLayout() {
		this.setTitle("FlowLayout");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
		FlowLayout flowLayout1 = new FlowLayout();
		FlowLayout flowLayout2 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowLayout3 = new FlowLayout(FlowLayout.CENTER, 50, 50);
		
		//this.setLayout(flowLayout1);
		//this.setLayout(flowLayout2);
		this.setLayout(flowLayout3);
		
		
		JButton jButton1 = new JButton("button");
		JButton jButton2 = new JButton("button");
		JButton jButton3 = new JButton("button");
		
		this.add(jButton1);
		this.add(jButton2);
		this.add(jButton3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new VD_FlowLayout();
	}
}

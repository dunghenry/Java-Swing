package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCaculator extends JFrame {
	public MyCaculator() {
		this.setTitle("My Caculator");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField jTextField = new JTextField(50);
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField, BorderLayout.CENTER);
		
		JButton jButton0 = new JButton("0");
		JButton jButton1 = new JButton("1");
		JButton jButton2 = new JButton("2");
		JButton jButton3 = new JButton("3");
		JButton jButton4 = new JButton("4");
		JButton jButton5 = new JButton("5");
		JButton jButton6 = new JButton("6");
		JButton jButton7 = new JButton("7");
		JButton jButton8 = new JButton("8");
		JButton jButton9 = new JButton("9");
		JButton jButtoncong = new JButton("+");
		JButton jButtontru = new JButton("-");
		JButton jButtonnhan = new JButton("*");
		JButton jButtonchia = new JButton("/");
		JButton jButtonbang = new JButton("=");
		
		JPanel jPanel_buttons = new JPanel();
		jPanel_buttons.setLayout(new GridLayout(5, 3));
		jPanel_buttons.add(jButton0);
		jPanel_buttons.add(jButton1);
		jPanel_buttons.add(jButton2);
		jPanel_buttons.add(jButton3);
		jPanel_buttons.add(jButton4);
		jPanel_buttons.add(jButton5);
		jPanel_buttons.add(jButton6);
		jPanel_buttons.add(jButton7);
		jPanel_buttons.add(jButton8);
		jPanel_buttons.add(jButton9);
		jPanel_buttons.add(jButtoncong);
		jPanel_buttons.add(jButtontru);
		jPanel_buttons.add(jButtonnhan);
		jPanel_buttons.add(jButtonchia);
		jPanel_buttons.add(jButtonbang);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_buttons, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new MyCaculator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

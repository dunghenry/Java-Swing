package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterController;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JLabel jLabel_value;
	private JButton jButton_bottom;
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("Counter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener action = new CounterController(this);
		jButton_up = new JButton("UP");
		jButton_up.addActionListener(action);
		jButton_down = new JButton("DOWN");
		jButton_down.addActionListener(action);
		jButton_bottom = new JButton("RESET");
		jButton_bottom.addActionListener(action);
		jLabel_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_up, BorderLayout.WEST);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		jPanel.add(jButton_down, BorderLayout.EAST);
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new BorderLayout());
		jPanel2.add(jButton_bottom, BorderLayout.CENTER);
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
		this.add(jPanel2, BorderLayout.SOUTH);
	}
	public void increasement() {
		this.counterModel.increasement();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
	public void decreasement() {
		this.counterModel.decreasement();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
	public void reset() {
		this.counterModel.reset();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
}

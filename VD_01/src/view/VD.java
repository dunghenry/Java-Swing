package view;

import javax.swing.JFrame;

public class VD {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		//Tao kich thuoc man hinh
		jf.setSize(400, 400);
		
		//Dat ten
		jf.setTitle("Vi Du JFrame");
		
		//Set hien thi
		jf.setVisible(true);
		
		//Gan vi tri hien thi
		jf.setLocation(1000, 200);
		//Thoat khi dong cua so jframe
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//HIDE_ON_CLOSE 
	}
}

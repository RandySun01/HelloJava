package cn.edu.hnnu.chap09.sec03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JButtonTest {

	public static void main(String[] args) {
		JFrame jFrame	=	new JFrame("JButton����");
		JButton jb	=	new JButton("����һ����ť");
		jFrame.add(jb);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(null, "������һ��");
			}
		});
		jFrame.setLocation(400, 200); // ����������λ��
		jFrame.setSize(500,200); // ����������С
		jFrame.setVisible(true); // ��������ʾ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

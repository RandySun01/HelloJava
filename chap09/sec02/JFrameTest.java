package cn.edu.hnnu.chap09.sec02;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class JFrameTest {

	public static void main(String[] args) {
		JFrame jFrame	=	new JFrame("JFrame����");
		Container c	=	jFrame.getContentPane();
		c.setBackground(Color.RED);
		//jFrame.getContentPane().setBackground(Color.RED); // ���������ı�����ɫ
		jFrame.setLocation(400, 200); // ����������λ��
		jFrame.setSize(500,200); // ����������С
		jFrame.setVisible(true); // ��������ʾ
	}
}

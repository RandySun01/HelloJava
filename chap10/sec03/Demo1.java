package cn.edu.hnnu.chap10.sec03;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Demo1 {

	
	public static void main(String[] args) throws Exception {
		File file	=	new File("f://����1.txt");
		InputStream inputStream		=	new FileInputStream(file);  // ʵ����FileInputStream
		byte b[]	  =  new byte[1024];
		int len  =  inputStream.read(b);
		int a = inputStream.available();
		System.out.println(a);
		inputStream.close(); // �ر�������
		
		System.out.println("��ȡ�������ǣ�"+new String(b,0,len));
	}
}

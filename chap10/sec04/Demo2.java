package cn.edu.hnnu.chap10.sec04;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		File file	=	new File("D://�����ļ�.txt");
		Reader reader	=	new FileReader(file);
		char c[]	 =	new char[1024]; // �ַ�����
		int temp	=	0;
		int len	=	0;
		temp = reader.read();
		while(temp != -1){
			temp = reader.read();
			c[len++]	=	(char)temp;
		}
		reader.close();  // �ر�������
		System.out.println("��ȡ�������ǣ�"+new String(c,0,len));
	}
}

package cn.edu.hnnu.chap10.sec02;

import java.io.File;

public class Demo3 {

	public static void main(String[] args) {
		File file	=	new File("E:\\pptģ��\\��18��PPT���䱳�����ֿ�\\MID�����ļ�\\��������mid1");
		File files[]	=	file.listFiles();  // ����Ŀ¼
		for(int i	=	0;i<files.length;	i++){
			System.out.println(files[i]);
		}
	}
}

package cn.edu.hnnu.chap10.sec02;

import java.io.File;

public class Demo3 {

	public static void main(String[] args) {
		File file	=	new File("E:\\pptÄ£°å\\¡¾18¡¿PPT¾­µä±³¾°ÒôÀÖ¿â\\MIDÒôÀÖÎÄ¼ş\\±³¾°ÒôÀÖmid1");
		File files[]	=	file.listFiles();  // ±éÀúÄ¿Â¼
		for(int i	=	0;i<files.length;	i++){
			System.out.println(files[i]);
		}
	}
}

package cn.edu.hnnu.chap02.sec04;

public class Demo3 {

	public static void main(String[] args) {
		int a = 1;
		// a++ ��ʾ������ֵ������������
		int b1 = a++;
		System.out.println("b1="+b1);
		System.out.println("a="+a);
		
		// ++a��ʾ��������������ֵ����
		int b = ++a;
		System.out.println("b="+b);
		System.out.println("a="+a);
	}
}

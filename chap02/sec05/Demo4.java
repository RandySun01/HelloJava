package cn.edu.hnnu.chap02.sec05;

public class Demo4 {

	public static void main(String[] args) {
		int a = 213;
		int bai = a/100;
		int shi = a/10%10;
		int ge = a%10;
		System.out.println(bai+"  "+shi +"  "+ge+ " ");
		for(int i=100;i<=999;i++){
			// �����λ��
			int b=i/100;
			// ���ʮλ��
		    int s=(i-b*100)/10;
		    // ���λ��
		    int g=i-b*100-s*10;
		    if(i==g*g*g+s*s*s+b*b*b){
		    	System.out.print(i+" ");
		    }
		}
	}
}

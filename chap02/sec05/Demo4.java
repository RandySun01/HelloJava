package cn.edu.hnnu.chap02.sec05;

public class Demo4 {

	public static void main(String[] args) {
		int a = 213;
		int bai = a/100;
		int shi = a/10%10;
		int ge = a%10;
		System.out.println(bai+"  "+shi +"  "+ge+ " ");
		for(int i=100;i<=999;i++){
			// 求出百位数
			int b=i/100;
			// 求出十位数
		    int s=(i-b*100)/10;
		    // 求个位数
		    int g=i-b*100-s*10;
		    if(i==g*g*g+s*s*s+b*b*b){
		    	System.out.print(i+" ");
		    }
		}
	}
}

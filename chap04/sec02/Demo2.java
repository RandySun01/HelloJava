package cn.edu.hnnu.chap04.sec02;

public class Demo2 {

	public static void testFinally(){
		String str = "123a";
		try{
			int a = Integer.parseInt(str);
			System.out.println(a);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("exception");
			return;
		}finally{
			
			System.out.println("final end");
		}
		System.out.println("end00000");
	}
	
	public static void main(String[] args) {
		testFinally();
	}
}

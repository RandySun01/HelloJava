package cn.edu.hnnu.chap03.sec10;

public class Test extends People{

	private final int a = 1;
	public void action(){
		//a = 2;
		System.out.println("做一个良好坏蛋！");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
	    People p = new People();
	    test.action();
	    p.action();
		System.out.println(Common.SOMETILE);
		System.out.println();
	}
}

package cn.edu.hnnu.chap08.sec04;

public class Demo3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);
				// ��ȡ��ǰ�߳�
				Thread t=Thread.currentThread();
				System.out.println(t.getName()+":"+i); // �����̵߳�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Demo3 demo1	=	new Demo3();
		new Thread(demo1).start();
		
	}

}

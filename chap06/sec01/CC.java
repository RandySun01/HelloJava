package cn.edu.hnnu.chap06.sec01;

/**
 * ���巺����
 * @author sunrongzhi
 *
 * @param <T>
 */
public class CC<T>{

	private T ob;

	
	public CC(T ob) {
		super();
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
	/**
	 * ��ӡT������
	 */
	public void print(){
		System.out.println("T��ʵ�������ǣ�"+ob.getClass().getName());
	}
	
}

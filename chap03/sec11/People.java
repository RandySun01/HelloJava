package cn.edu.hnnu.chap03.sec11;

/**
 * ����һ��������People
 * @author sunrongzhi
 *
 */
public abstract class People {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void say(){
		System.out.println("�ҵ������ǣ�"+this.getName());
	}
	
	/**
	 * ����һ�����󷽷� ְҵ
	 */
	public abstract void profession();
}

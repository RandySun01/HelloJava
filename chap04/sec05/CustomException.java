package cn.edu.hnnu.chap04.sec05;

/**
 * �Զ����쳣���̳���Exception
 * @author sunrongzhi
 *
 */
public class CustomException extends Exception{

	public String message;
	public CustomException(String message){
		super(message);
		this.message = message;
	}
}

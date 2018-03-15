package cn.edu.hnnu.chap04.sec05;

/**
 * 自定义异常，继承自Exception
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

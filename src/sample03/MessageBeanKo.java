package sample03;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageBean") //xml이 너무 길기때문에 어노테이션으로 바꾸었다.
@Scope("prototype") // 싱글톤이 아니기때문에/ 싱글톤 하나의 클래스를 생성하고 여러번 호출해도 누적안되고 그 값만 가져와서 초기화 해주면서 계속쓰는거. 
public class MessageBeanKo implements MessageBean {
	private int num; 
	
	public MessageBeanKo() {
		System.out.println("기본생성자");
	}
	
	@Override
	public void sayHello(String name) {
		num++;
		
		System.out.println("num = " + num);
		System.out.println("안녕하세요 "+name);
	}

}

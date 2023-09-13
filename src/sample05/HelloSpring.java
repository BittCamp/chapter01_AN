package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SungJuk sungJuk = (SungJuk) applicationContext.getBean("sungJukImpl"); // 이부분에서 기본생성자가 호출이된다.
		sungJuk.calc();
		sungJuk.display();
		
		
		
	}
}

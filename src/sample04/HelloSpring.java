package sample04;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring{
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		Calc calc = (Calc) applicationContext.getBean("calcAdd");
		calc.calculate(25, 36);
		calc = applicationContext.getBean("calcMul",Calc.class); 
		calc.calculate(25, 36);
	}

}
//이거 실행하는데.. 이게 나옴. 왜..
/*public SungJukImpl() {
	Scanner scan = new Scanner(System.in);
	System.out.println("[실행결과]");
	System.out.println("이름 입력 :");
	name = scan.next();
	System.out.println("국어 입력 :");
	kor = scan.nextInt();
	System.out.println("영어 입력 :");
	eng = scan.nextInt();
	System.out.println("수학 입력 :");
	math = scan.nextInt();
}*/

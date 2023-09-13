package sample04;

import org.springframework.stereotype.Component;

@Component //스프링이 객체명을 CalcAdd랑 똑같이 잡되 소문자로 잡는다. 규칙을 안다.
public class CalcAdd implements Calc {

	@Override
	public void calculate(int x, int y) {
		System.out.println(x+" + "+y + " = " + (x+y));
	}

}

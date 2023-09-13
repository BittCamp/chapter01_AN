package sample05;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private int avg;
	
	public SungJukImpl() {
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
	}
	
	@Override
	public void calc() {
		tot = (kor+eng+math+tot+avg);
		avg = (kor+eng+math+tot+avg)/5;
	}

	@Override
	public void display() {
		System.out.println("총점은 "+ tot);
		System.out.println("평균은 "+ avg);
	}

}

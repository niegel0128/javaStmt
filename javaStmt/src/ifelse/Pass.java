package ifelse;

import java.util.*;

/**
 * @file Pass.java
 * @author CSY
 * @date 2016. 3. 11.
 * @story 과목 점수를 입력하면 총점과 평균이 나오고
 * 이를 통해 합격 여부를 통지하는 프로그램
 * [결과]
 * ************************************************
 * 학생 자바 JSP SQL 스프링 총점 평균 합격여부
 * ------------------------------------------------
 * 홍길동 80  40  60    70    250  62.5   합격       
 * ************************************************
 * 합격 여부는 60이상이면 합격
 */
public class Pass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0, avg = 0;

		System.out.println("이름,자바,jsp,sql,스프링 점수를 입력하세요");
		String name = scanner.next();
		int java = scanner.nextInt(), jsp = scanner.nextInt(), sql = scanner.nextInt(), spring = scanner.nextInt();

		sum = java + sql + spring;
		avg = (java + sql + spring) / 3;

		System.out.println("학생 자바 JSP SQL 스프링 총점 평균 합격여부");
		if (avg >= 60) {
			System.out
					.println(name + " " + java + " " + jsp + " " + sql + " " + spring + " " + sum + " " + avg + " 합격");
		} else {
			System.out
					.println(name + " " + java + " " + jsp + " " + sql + " " + spring + " " + sum + " " + avg + " 불합격");
		}

	}
}

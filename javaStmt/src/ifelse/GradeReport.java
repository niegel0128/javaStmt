package ifelse;

import java.util.*;

/**
 * @file GradeReport.java
 * @author CSY
 * @date 2016. 3. 11.
 * @story 성적표(점수에 따라 A~F까지 학점부여)
 * [결과]
 * **********************************************
 * 이름 과목 점수 학점
 * ----------------------
 * 홍길동 영어 89점 B
 * ************************************************
 * 90점 이상 A
 * 80점 이상 B
 * 70점 이상 C
 * 60점 이상 D
 * 50점 이상 E
 * 50점 미만 F
 * 만약,입력한 점수가 100점 초과한다든지 0점 미만 이면
 * 잘못 입력했습니다. 라고 메시지 주기
 */
public class GradeReport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String hak = "";

		System.out.println("이름,과목,점수를 입력하세요");
		String name = scanner.next(), subject = scanner.next();
		int score = scanner.nextInt();
		System.out.println("이름 : " + name + " 과목 : " + subject + " 점수 : " + score);

		if (score >= 90) {
			hak = "A";
		} else if (score >= 80) {
			hak = "B";
		} else if (score >= 70) {
			hak = "C";
		} else if (score >= 60) {
			hak = "D";
		} else if (score >= 50) {
			hak = "E";
		} else if (score < 50) {
			hak = "F";
		} else if (score < 100 || score > 0) {
			hak = "잘못입력했습니다.";
		}

		System.out.println("이름  과목    점수  학점");
		System.out.println("-------------------------------");
		System.out.println(name + "\t" + subject + "\t" + score + "\t" + hak);
	}
}

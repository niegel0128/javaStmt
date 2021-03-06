package forloop;

import java.util.Scanner;

/**
 * @file InputSum.java
 * @author CSY
 * @date 2016. 3. 11.
 * @story 1부터 입력된 수까지의 정수의 합 구하기 예) 10을 입력하면 콘솔에는 1부터 10까지의 합은 55 입니다.
 */
public class InputSum {
	public static void main(String[] args) {
		int inputNum = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 입력된 수까지의 정수의 합 구하기");
		System.out.println("숫자를 입력해 주세요 :");
		inputNum = scanner.nextInt();

		for (int i = 1; i <= inputNum; i++) {
			sum = sum + i;
		}

		System.out.println("결과는 " + sum + " 입니다");

	}
}

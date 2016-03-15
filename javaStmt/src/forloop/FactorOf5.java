package forloop;

import java.util.*;

/**
 * @file FactorOf5.java
 * @author CSY
 * @date 2016. 3. 11.
 * @story 5의 배수의 갯수와 합.
 */
public class FactorOf5 {
	/**
	 * [결과] 1에서 100까지 함수까지 5배수의 갯수는 20이고 5배수의 합은 1050이다.
	 **/
	public static void main(String[] args) {
		int endNum = 0, count = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("리미트값 입력");
		endNum = scanner.nextInt();
		System.out.println("입력된 리미트값은" + endNum + "입니다.");

		for (int i = 1; i <= endNum; i++) {

			if (i % 5 == 0) {
				sum = sum + i;
				count++;
			}
		}

		System.out.println("1에서 " + endNum + "까지 함수까지" + "5배수의 갯수는 " + count + "이고" + "5배수의 합은 " + sum + "이다.");
	}
}

package forloop;

import java.util.*;

/**
 * @file Tax.java
 * @author CSY
 * @date 2016. 3. 11.
 * @story 이름과 연봉을 입력받아서 다음과 같은 결과물이 나오도록 출력하시오 세율은 10% [결과] 연봉 ***원을 받으시는 **님께서
 *        이번달 납부할 세금은 *** 만원 입니다.
 */
public class Tax {
	public static void main(String[] args) {
		String name = "";
		int sal = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 연봉을 입력하세요");
		name = scanner.next();
		sal = scanner.nextInt();
		System.out.println("입력하신 이름은" + name + "이고 연봉은" + sal + "입니다");

		int tax = sal / 10;
		System.out.println("연봉" + sal + "만원을 받으시는" + name + "님께서" + "이번달 납부할 세금은" + tax + "만원 입니다");
	}
}
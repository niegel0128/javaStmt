package forloop;

/**
 * @file InputGugudan.java
 * @author CSY
 * @date 2016. 3. 11.
 * @story 입력받은 정수의 구구단 구하기
 * 예를 들면 2를 입력하면 2단 출력
 * 109를 입력하면 109*2부터 109*9까지 출력
 * 다만, 0과 음수를 입력하면 1이상 정수값만 입력하시오.
 */
import java.util.*;

public class InputGugudan {
	public static void main(String[] args) {
		int num = 0, gugudan = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("입력받은 정수의 구구단 구하기");

		System.out.println("정수를 입력해 주세요");
		num = scanner.nextInt();
		System.out.println(+num + "단을 출력합니다");

		for (int i = 1; i <= 9; i++) {
			gugudan = num * i;
			System.out.println(num + "*" + i + "=" + gugudan);
		}

	}
}

package ifelse;

import java.util.*;

/**
 * @file TimeCalc.java
 * @author CSY
 * @date 2016. 3. 11.
 * @story 초를 입력하면 시간, 분, 초를 출력하는 프로그램 10000초를 입력하면 7시간 47분 13초
 */
public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("초를 입력해주세요");
		int second = scanner.nextInt();
		int hour = second / 3600;
		int minute = second / 60 - (hour * 60);
		second = second - ((hour * 3600) + (minute * 60));

		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}

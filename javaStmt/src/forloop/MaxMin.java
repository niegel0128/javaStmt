package forloop;

import java.util.*;

/**
 * @file MaxMin.java
 * @author CSY
 * @date 2016. 3. 11.
 * @story 최고점,최저점 구하기 [결과] 학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다. 단,정원은 5명 입니다. 평균점수를
 *        입력하세요. .... 최고점은 100점이고 최저점은 30점 입니다.
 */
public class MaxMin {
	public static void main(String[] args) {
		System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다." + "단,정원은 5명 입니다." + "평균점수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0, min = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번쨰 학생의" + "평균점수를 입력하세요 : ");
			arr[i] = scanner.nextInt();
			System.out.println(arr[i]);
		}
		max = Math.max(arr[0], arr[4]);
		min = Math.min(arr[0], arr[4]);

		// 현재 arr[0]~[5]=입력값이 된 상태
		System.out.println("최고점은" + max + "점이고" + "최저점은" + min + "점 입니다.");
	}
}

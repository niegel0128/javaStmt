package forloop;

/**
 * @file Gugudan.java
 * @author CSY
 * @date 2016. 3. 11.
 * @story 2단부터 9단까지 구구단 출력 단, 책받침 구구단으로 출력 2*1=2 3*1=3 4*1=4 5*1=5 2*2=4 3*2=6
 *        4*2=8 5*2=10 이런식
 */
public class Gugudan {
	public static void main(String[] args) {
		int gugu1 = 0, gugu2 = 0, gugu3 = 0, gugu4 = 0;

		for (int i = 2; i <= 9; i += 4) {
			for (int j = 1; j <= 9; j++) {
				gugu1 = i * j;
				gugu2 = (i + 1) * j;
				gugu3 = (i + 2) * j;
				gugu4 = (i + 3) * j;
				System.out.println(i + "*" + j + "=" + gugu1 + "\t" + (i + 1) + "*" + j + "=" + gugu2 + "\t" + (i + 2)
						+ "*" + j + "=" + gugu3 + "\t" + (i + 3) + "*" + j + "=" + gugu4);
			}
			System.out.println();
		}
	}
}

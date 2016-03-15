package forloop;

/**
 * @file Oddsum.java
 * @author CSY
 * @date 2016. 3. 10.
 * @story
 */
public class Oddsum {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}

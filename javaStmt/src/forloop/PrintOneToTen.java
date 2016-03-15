package forloop;

/**
 * @file PrintOneToTen.java
 * @author CSY
 * @date 2016. 3. 11.
 * @story 1부터 10까지 정수값 출력(가로로 출력, \t 탭역활)
 */
public class PrintOneToTen {
	public static void main(String[] args) {
		int arr[] = new int[11];

		for (int i = 1; i < 11; i++) {
			arr[i] = i;
		}
		System.out.println(arr[1] + "\t" + arr[2] + "\t" + arr[3] + "\t" + arr[4] + "\t" + arr[5] + "\t" + arr[6] + "\t"
				+ arr[7] + "\t" + arr[8] + "\t" + arr[9] + "\t" + arr[10] + "\t");
	}
}

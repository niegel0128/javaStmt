package whileloop;

import java.util.*;

/**
 * @file NumGolfMain.java
 * @author CSY
 * @date 2016. 3. 10.
 * @story 
 * 컴퓨터가 랜덤 생성한 숫자를 가장 빠른 횟수로 맞추는 게임.
 */
public class NumGolfMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumGolfBean bean = new NumGolfBean();
		System.out.println("컴퓨터 랜덤 수 발생");
		bean.setCom();
		
		System.out.println("1~10까지의 랜덤한 수 입력 : ");
		bean.setPlayer(scanner.nextInt());
		
		if(bean.getCom()==bean.getPlayer()){
			System.out.println("게임이 끝났습니다.");
			System.out.println("발생한 랜덤수 : "+ bean.getCom());
		}else{
			System.out.println("1~10까지의 랜덤한 수 입력 : ");
			bean.setPlayer(scanner.nextInt());
		}
	}
}

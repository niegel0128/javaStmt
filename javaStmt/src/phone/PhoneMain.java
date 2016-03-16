package phone;

import java.util.Scanner;

public class PhoneMain {
	public void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("====집전화기로 통화====");
		PhoneMain pm = new PhoneMain();
//		pm.usePhone(s);
//		pm.useNokia(s);
		pm.useIPhone(s);
//		pm.useAndroid(s);
	}

	public void useIPhone(Scanner s) {
		IPhone iPhone = new IPhone();
		iPhone.setCompany("애플");
		System.out.println(iPhone.getCompany()+"를 사용");
		System.out.println("휴대폰으로 통화 할 사람");
		iPhone.setCall(s.next());
		System.out.println("메시지를 입력하세요");
		iPhone.setData(s.next(),iPhone.getCall());
		//System.out.println(iPhone.getCall());
		
		System.out.println(iPhone.getData());
	}

	public void useNokia(Scanner s) {
		Phone nokia = new CelPhone();
		//부모의 타입으로 자식의 생성자를 통해 인스턴스를 생성할 수 있다.
		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany()+"를 사용");
		System.out.println("휴대폰으로 통화 할 사람?");
		nokia.setCall(s.next());
		System.out.println(nokia.getCall());
	}

	public void usePhone(Scanner s) {
		Phone phone = new Phone();
		phone.setCompany("삼성집전화기");
		System.out.println(phone.getCompany()+"를 사용합니다.");
		System.out.println("통화할 사람?");
		phone.setCall(s.next());
		System.out.println(phone.getCall());
	}
	
	public void useAndroid(Scanner s) {
		AndroidPhone android = new AndroidPhone();
		android.setCompany("삼성집전화기");
		System.out.println(android.getCompany()+"를 사용합니다.");
		System.out.println("통화할 사람?");
		android.setCall(s.next());
		System.out.println(android.getCall());
	}
}

package bank;

import java.util.*;

public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankServiceImpl service = new BankServiceImpl();
		AdminServiceImpl admin = new AdminServiceImpl(100);
		
		int menu=0,num=0,num2=0; 
		String yn="";
		
		//사용자모드
		do{
			System.out.println("################사용자 모드################");
			System.out.println("메뉴선택] 1.입금  2.출금  3.잔액조회");
			menu = scanner.nextInt();
			
			if (menu==1) {
				System.out.println("이름,비밀번호 입력");
				System.out.println(service.openAccount(scanner.next(), scanner.nextInt()));
				System.out.println("입금 할 금액");
				System.out.println(service.deposit(scanner.nextInt()));
				System.out.println("잔액은"+service.findMoney()+"입니다");
				do{
					System.out.println("종료 y / 처음으로 되돌아가기 n");
					yn = scanner.next();
					if (yn=="y"||yn=="Y")
					{
						break;
					}else if(yn=="n"){
						num++;
					}else{
						System.out.println("다시입력해주세요 : ");
						num2++;
					}
				} while(num2==1);
			}
			if (menu==2){
				System.out.println("이름,비밀번호 입력");
				System.out.println(service.openAccount(scanner.next(), scanner.nextInt()));
				System.out.println("출금 할 금액");
				System.out.println(service.withdraw(scanner.nextInt()));
				System.out.println("잔액은"+service.findMoney()+"입니다");
			}
		} while (num==1);
	}
}

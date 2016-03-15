package grade;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class GradeController {
	public static void main(String[] args) {
		Scanner s =  new  Scanner(System.in);
		GradeServiceImpl service = new GradeServiceImpl();
		GradeBean grade = new GradeBean();
		while (true) {
			
			System.out.println("[메뉴] 1.등록 2.수정 3.삭제 4.조회(전체) 5.조회(이름) 6.조회(학번) 7.회원수 0.종료");
			switch (s.nextInt()) {
			case 1:
				System.out.println("학번,이름,자바,SQL,JSP,스프링 입력");
				int hak=s.nextInt();
				String name=s.next();
				int java=s.nextInt(),sql=s.nextInt(),jsp=s.nextInt(),spring=s.nextInt();
				service.input();
				break;
			case 2:
				service.update();
				break;
			case 3:
				service.delete();
				break;
			case 4:
				service.getList();
				break;
			case 5:
				service.getGradesByName();
				break;
			case 6:
				service.getGradeByHak();
				break;
			case 7:
				service.getCount();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못된 연결입니다.");
				break;
			}
		}
	}
}
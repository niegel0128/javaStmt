package grade;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	/*
	 * private String name; private int hak, java, sql, jsp, spring;
	 */

	// 멤버 필드
	// 속성을 모아놓은곳 (Bean)
	private Vector<GradeBean> gradeList;

	// Vector<GradeBean> gradeList = new Vector<GradeBean>(); //인스턴스변수
	public GradeServiceImpl() {
		gradeList = new Vector<GradeBean>(); // 인스턴스 변수 초기화
	}
	// 메서드 내부에 위치하면 참조변수(공유를 안하므로)
	// 멤버 메소드 에어리어
	// 기능을 모아놓은곳(Service)

	@Override
	public void input(GradeBean gradeBean) {
		// 성적표 등록 C
		gradeList.add(new GradeBean(2, "김유신", 100, 100, 100, 100));
		gradeList.add(new GradeBean(3, "이유신", 90, 90, 90, 90));
		gradeList.add(new GradeBean(4, "박유신", 80, 80, 80, 80));
		gradeList.add(new GradeBean(5, "우유신", 700, 70, 70, 70));
		gradeList.add(new GradeBean(6, "유유신", 60, 60, 60, 60));
		gradeList.add(new GradeBean(7, "조유신", 50, 50, 50, 50));
		gradeList.add(gradeBean);
	}

	@Override
	public Vector<GradeBean> getList() {
		// 성적표 리스트 출력 R

		return gradeList;

	}

	@Override
	public GradeBean getGradeByHak(int hak) {
		// 성적표 조회(학번) R
		GradeBean tempBean = new GradeBean(); 
		//모든 데이터를 넘길수 없으므로 하나의 객체를 생성하여
		//요구하는 객체의 정보만 넘긴다.

		for (int i = 0; i < gradeList.size(); i++) {

			System.out.println(gradeList.get(i).getHak());

			if (gradeList.get(i).getHak() == hak) {
				tempBean.setHak(gradeList.get(i).getHak());
				tempBean.setName(gradeList.get(i).getName());
				tempBean.setJava(gradeList.get(i).getJava());
				tempBean.setJsp(gradeList.get(i).getJsp());
				tempBean.setSql(gradeList.get(i).getSql());
				tempBean.setSpring(gradeList.get(i).getSpring());
				break;
			} else
			{
				tempBean.setName("결과없음");
			}

		}
		return tempBean;

	}

	@Override
	public void getGradesByName() {
		// 성적표 조회(이름) R

	}

	@Override
	public void update() {
		// 성적표 수정 U

	}

	@Override
	public GradeBean delete(int hak) {
		// 성적표 삭제 D
		String temp = "";
		for (int i = 0; i < gradeList.size(); i++) {
			if(gradeList.get(i).getHak() == hak)
			{
				gradeList.remove(i);
			}
			
		}
		return null;

	}

	@Override
	public int getCount() {
		// R 카운트 조회

		return gradeList.size();

	}

	@Override
	public void getCountByName() {
		// R 이름조회시 카운트 조회

	}

}

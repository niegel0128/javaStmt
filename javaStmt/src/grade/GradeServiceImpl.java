package grade;

import java.util.Vector;

public class GradeServiceImpl implements GradeService
{
	//멤버 필드
	Vector<GradeBean> gradeList;
	//멤버 메소드 에어리어

	public GradeServiceImpl() {
		gradeList = new Vector<GradeBean>(); //초기화
	}
	
	@Override
E	public void input(GradeBean grade) {
		// 성적표 등록
		gradeList.add(grade);
	}

	
	public Vector<GradeBean> getGradeList() {
		Vector<GradeBean> tempList = new Vector<GradeBean>();
		return gradeList;
	}

	public void setGradeList(Vector<GradeBean> gradeList) {
		this.gradeList = gradeList;
	}

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getGradeByHak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getGradesByName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCountByName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}

package grade;

public class GradeBean {
	private String name;
	private int hak,java,sql,jsp,spring;
	
	//생성자 오버로딩
	public GradeBean() {
	
	}
	//0315
	public GradeBean(String name,int hak,int java,int sql,int jsp, int spring) {
		this.name = name;
		this.hak = hak;
		this.java = java;
		this.sql = sql;
		this.jsp = jsp;
		this.spring = spring;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHak() {
		return hak;
	}
	public void setHak(int hak) {
		this.hak = hak;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}

	//컨트롤+쉬프트+s+s
	@Override
	public String toString() {
		return "GradeBean [이름=" + name + ", 학번=" + hak + ", 자바=" + java + ", sql=" + sql + ", jsp=" + jsp
				+ ", 스프링=" + spring + "]";
	}

}

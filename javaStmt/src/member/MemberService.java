package member;

public interface MemberService {
	public void join(MemberBean member);
	public void login(String id, String password);
	public void detail(String id);
	public void update(MemberBean member);
	public void remove(String id);
}

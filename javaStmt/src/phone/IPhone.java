package phone;

/**
 * @file IPhone.java
 * @author CSY
 * @date 2016. 3. 16.
 * @story
 */
public class IPhone extends CelPhone {
	private String data;
	public static String BRAND = "아이폰";
	public static boolean TRUE = true;

	// 아이폰은 집전화기는 생산하지 않는다.
	public String getData() {
		return data;
	}

	public void setData(String date) {
		this.data = date;
	}

	public void setData(String data,String name) {
		this.data = data;
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
				super.getCompany()+"\t"
				//+super.isPortable()+"\t"
				+super.getCall()+"\t"
				+data+ " : 메시지 전달";
	}
	
	public void setCall(String call) {
		super.call = call;
	}
	
}

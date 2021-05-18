package mh;

public class AA {
	private int a;
	private String b;
	
	@Override
	public String toString() {
		return "AA [a=" + a + ", b=" + b + "]";
	}
	public AA() {}
	public AA(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public void doA() {
		System.out.println("doA함수입니다.");
	}
}

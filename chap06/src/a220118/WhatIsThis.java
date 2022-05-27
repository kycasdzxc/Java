package a220118;

public class WhatIsThis {
	public static void main(String[] args) {
		WhatIsThis isThis = new WhatIsThis();
		System.out.println(isThis);
		isThis.printWhatIsThis();
		System.out.println(isThis.getWhatIsThis());
//		System.out.println(this);
	}
	
	WhatIsThis getWhatIsThis() {
		return this;
	}
	
	void printWhatIsThis() {
		System.out.println(this);
	}
	
//	static void sm() {
//		System.out.println(this);	// 인스턴트가 생성되지 않았기 때문에
//	}
	
}

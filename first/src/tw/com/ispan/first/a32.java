package tw.com.ispan.first;

public class a32 {

	public static void main(String[] args) {
		a321 obj1 = new a321();
		a322 obj2 = new a322();
		a321 obj3 = new a322();
		obj3.m1();
		a322 obj4 = (a322) obj3;
		obj4.m2();
		System.out.println("---");
		test1(obj3);
		System.out.println("---");

		if (obj3 instanceof a321) {
			System.out.println("OK");
		} else {
			System.out.println("XX");
		}

	}

	static void test1(a321 obj) {
		obj.m1();
	}

}

class a321 {
	void m1() {
		System.out.println("a321:m1()");
	}
}

class a322 extends a321 {
	void m1() {
		System.out.println("a322:m1()");
	}

	void m2() {
		System.out.println("a322:m2()");
	}
}

class a323 extends a321 {
	void m1() {
		System.out.println("a323:m1()");
	}

	void m2() {
		System.out.println("a323:m2()");
	}
}
// 型別轉換的概念
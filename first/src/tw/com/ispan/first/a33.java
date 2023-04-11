package tw.com.ispan.first;

public class a33 {

	public static void main(String[] args) {
		// 不行a331 obj1 = new a331();
		a331 obj1 = new a332();
		obj1.m2();
		a331 obj2 = new a331() {
			void m2() {
				System.out.println("ok");
			}
		};

		obj2.m2();
	}
}

abstract class a331 {
	void m1() {
		System.out.println("a331:m1()");
	}

	abstract void m2();
}

class a332 extends a331 {
	void m2() {
		System.out.println("a332:m2");
	}
}

class a333 extends a331 {
	void m2() {
		System.out.println("a333:m3");
	}
}

abstract class a334 {
	void m1() {
	}

	void m2() {
	}

	void m3() {
	}

	void m4() {
	}
}

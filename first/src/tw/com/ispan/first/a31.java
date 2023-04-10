package tw.com.ispan.first;

public class a31 {

	public static void main(String[] args) {
		a313 obj1 = new a313();
		a313 obj2 = new a313(2);
	}
}

class a311 {
	a311(int a) {
		System.out.println("a311(int)");
	}
}

class a312 extends a311 {
	a312() {
		super(1);
		System.out.println("a312()");
	}

	a312(int b) {
		super(2);
		System.out.println("a312(int)");
	}
}

class a313 extends a312 {
	a313() {
		super(3);
		// this(3);
		System.out.println("a313()");
	}

	a313(int a) {
		this();
		System.out.println("a313(int)");
	}
}

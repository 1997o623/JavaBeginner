package tw.com.ispan.first;

public class a42 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		System.out.println(b1.setlegs());
		try {
			b1.setlegs(2);
			System.out.println(b1.setlegs());
		} catch (Exception e) {
			System.out.println("XX");
		}
	}
}

class Bird {
	private int legs;

	void setlegs(int num) throws legsexception {
		if (num >= 0 && num <= 2) {
			legs = num;
		} else {
			throw new legsexception();
		}
	}

	int setlegs() {
		return legs;
	}
}

class legsexception extends Exception {

}

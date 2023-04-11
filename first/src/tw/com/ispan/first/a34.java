package tw.com.ispan.first;

public class a34 {

	public static void main(String[] args) {
		shape s1 = new recShape(10, 4);
		shape s2 = new circle(10);
		System.out.println(s1.area());
		System.out.println(s2.area());
	}

	static void sum(shape s1, shape s2) {
		System.out.println(s1.length() + s2.length());
	}
}

interface shape {
	double length();

	double area();
}

class recShape implements shape {
	double w, h;

	public recShape(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public double length() {
		return 2 * (w + h);
	}

	public double area() {
		return w * h;
	}
}

class circle implements shape {
	double r;

	public circle(double r) {
		this.r = r;
	}

	public double length() {
		return 2 * Math.PI * r;
	}

	public double area() {
		return Math.PI * r * r;
	}

}

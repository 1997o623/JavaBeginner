package tw.com.ispan.first;

public class a16 {

	public static void main(String[] args) {
		int i = 19;
		for (print(); i < 30; printline() )
		System.out.println(i++);
	}
	static void print() {
		int lottery = (int)(Math.random()*49+1);
		System.out.println(lottery);
	}	

	static void printline() {
	System.out.println("-----------");
}
}
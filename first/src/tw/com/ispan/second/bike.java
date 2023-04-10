package tw.com.ispan.second;

import java.io.Serializable;

public class bike extends Object implements Serializable {
	protected double speed;// 用在繼承的子類別，不會被檔

	public void speedup() {

		speed = speed < 1 ? 1 : speed * 1.4;
		// ? -->三元運算式 布林?若T給值1:若F給值2
	}

	public void speeddown() {
		speed = speed < 1 ? 0 : speed * 0.5;
	}

	public double getspeed() {// 速度被封裝
		return speed;
	}

}

//設計一個腳踏車
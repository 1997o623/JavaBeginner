package tw.com.ispan.second;

public class scooter extends bike {

	private int gear;
	private String color;

	public scooter() {// 建構式是初始化，建構一個物件是new
		color = "灰色";
	}

	public scooter(String color2) {
		color = color2;
	}

	public String getcolor() {
		return color;
	}

	{
		gear = gear < 4 ? 0 : gear + 1;
	}

	@Override // 讓開發者知道這是改寫的，把這行拿掉也OK
	public void speedup() {
		speed = speed < 1 ? 1 : speed * gear * 3;
		super.speedup();
	}

	public void speedup(int a) {

	}

	public boolean gearchange(int gear2) {
		if (gear >= 0 || gear <= 4) {
			gear = gear2;
			return true;
		} else {
			return false;
		}
	}

}
//this若名稱相同所產生的物件，就是之前宣告的物件，
//機車繼承腳踏車(extend)
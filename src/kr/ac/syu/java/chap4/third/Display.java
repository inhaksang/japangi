package kr.ac.syu.java.chap4.third;

public class Display {
	public void showMSG(int menu, int returnmoney) {
		switch (menu) {
		case 1:
			System.out.println("아메리카노가 제공됩니다.");
			break;
		case 2:
			System.out.println("카페라떼가 제공됩니다.");
			break;
		case 3:
			System.out.println("우유가 제공됩니다.");
			break;
		}
		System.out.println("거스름돈 " + returnmoney +"원이 반환되었습니다.");
	}

}

//2024100895 이재우
//돈 통
package kr.ac.syu.java.chap4_3;


class MoneyBox {
	Menu menu = new Menu();
	
	
	//거스름돈 전용
	private int _100, _500, _1000, _5000; //static 되도록 사용 x
	
	// 기본 생성자
	public MoneyBox() {}
	
	//초기값 설정용 생성자
	public MoneyBox(int[] money) {
		this._100 = money[0];
		this._500 = money[1];
		this._1000 = money[2];
		this._5000 = money[3];
	}
	
	
	public boolean warmon() {
		return (_5000  < 1 || _1000  < 10 || _500 < 10 || _100 < 10) ? true : false;
	}
	
	static int totalmoney = 0; //총 수익
	
	
	
	
	public void havingMoney() { //잔여 거스름돈 확인
		System.out.println("잔여 거스름돈: \n100원 " + _100 + "개\n500원 " + _500 + "개\n1000원 " + _1000 + "개\n5000원 " + _5000 + "개");
	}
	
	public void insertMoney(int type, int amount) { //거스름돈 추가
		switch (type) {
		case 100:
			_100 += amount;
			break;
		case 500:
			_500 += amount;
			break;
		case 1000:
			_1000 += amount;
			break;
		case 5000:
			_5000 += amount;
			break;
		default:
			System.out.println("올바른 단위를 입력하시오");
		}
		havingMoney();
		warmon();
	}
	public int returnMoney(int choice, int money) { //거스름돈 반환
		int price = menu.findPrice(choice);
		int returnmoney = money - price;
		int i = returnmoney;
		while (i > 0) {
			while (i >= 500) {
				while (i >= 1000) {
					while (i >= 5000) {
						_5000--;
						i -= 5000;
					}
					_1000--;
					i -= 1000;
				}
				_500--;
				i -= 500;
			}
			_100--;
			i -= 100;
		}
		warmon();
		
		return returnmoney;
	}
	
	
}

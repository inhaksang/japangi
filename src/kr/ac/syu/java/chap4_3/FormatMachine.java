package kr.ac.syu.java.chap4_3;

//초기값 설정용 클래스

public class FormatMachine {
	
	private CoffeeTong coffeetong;
	private WaterTong watertong;
	private MilkTong milktong;
	private IceTong icetong;
	private CupTong cuptong;
	private MoneyBox moneybox;
	
	public FormatMachine() {}
	
	public FormatMachine(int[] firstadd, int[] money) {

		coffeetong = new CoffeeTong(firstadd[0]);
		watertong = new WaterTong(firstadd[1]);
		milktong = new MilkTong(firstadd[2]);
		icetong = new IceTong(firstadd[3]);
		cuptong = new CupTong(firstadd[4], firstadd[5]);
		
		moneybox = new MoneyBox(money);
		
		
	}
	
	// 매번 새로운 객체를 생성하지 않기 위해 이미 만들어놓은 객체를 다시 return함
	public CoffeeTong getCoffee() {
		return coffeetong;
	}

	public WaterTong getWater() {
		return watertong;
	}

	public MilkTong getMilk() {
		return milktong;
	}

	public IceTong getIce() {
		return icetong;
	}

	public CupTong getCup() {
		return cuptong;
	}
	
	public MoneyBox getMoney() {
		return moneybox;
	}

}

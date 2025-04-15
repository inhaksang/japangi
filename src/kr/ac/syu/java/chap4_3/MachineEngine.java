//2024100895 이재우
package kr.ac.syu.java.chap4_3;

public class MachineEngine {
	
	private MoneyBox moneybox;
	private CoffeeTong coffee;
	private WaterTong water;
	private MilkTong milk;
	private CupTong cup;
	private IceTong ice;
	private Display display;
	
	public MachineEngine(CoffeeTong coffee, WaterTong water, MilkTong milk, CupTong cup, IceTong ice, MoneyBox moneybox) { //생성자
		this.coffee = coffee;
		this.water = water;
		this.milk = milk;
		this.cup = cup;
		this.ice = ice;
		this.moneybox = moneybox;
		display = new Display();
	}

	public void processSelection(int choice, int icehot, int money) {
		coffee.coffeetong(choice);
		water.watertong(choice);
		milk.milktong(choice);
		cup.cuptong(icehot);
		ice.icetong(icehot);
		
		int returnmoney = moneybox.returnMoney(choice, money);
		moneybox.totalmoney += money - returnmoney;
		display.showMSG(choice, returnmoney);
		
	}
		
	
	
	
}

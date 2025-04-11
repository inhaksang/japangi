//나는이재우

package kr.ac.syu.java.chap4.third;

public class MachineEngine {
	private MoneyBox moneyBox; //돈통
	private CoffeeTong coffee; //커피통
	private WaterTong water; //물통
	private MilkTong milk; //우유통
	private CupTong cup;//컵통
	private IceTong ice; //얼음통
	private Display display; //화면
	
	public MachineEngine() { //생성자
		moneyBox = new MoneyBox();
		coffee = new CoffeeTong(); 
		water = new WaterTong();
		milk = new MilkTong();
		cup = new CupTong();
		ice = new IceTong(); 
		display = new Display();
	}

	public void processSelection(int choice, int icehot, int money) {
		moneyBox.totalmoney += money;
		coffee.coffeetong(choice);
		water.watertong(choice);
		milk.milktong(choice);
		cup.cuptong(icehot);
		ice.icetong(icehot);
		
		int returnmoney = moneyBox.returnMoney(choice, money);
		display.showMSG(choice, returnmoney);
		
	}
		
	
	
	
}

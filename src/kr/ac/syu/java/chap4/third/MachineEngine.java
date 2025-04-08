//나는이재우

package kr.ac.syu.java.chap4.third;

public class MachineEngine {
	private MoneyBox moneyBox; //돈통
	private CoffeeTong coffeeTong; //커피통
	private WaterTong waterTong; //물통
	private CupTong cupTong; //컵통
	private CreamTong creamTong; //크림통
	private Display display; //화면
	
	public MachineEngine() { //생성자
		moneyBox= new MoneyBox();
		coffeeTong= new CoffeeContainer(); 
		waterTong= new WaterContainer();
		creamTong= new CreamContainer(); 
		display= new Display();
	}

}

public void processSelection(int choice, int money) {
	
	
}

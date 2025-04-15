//2024100895 이재우
package kr.ac.syu.java.chap4_3;
import java.util.Scanner;

//관리자 모드 클래스

public class Manager {
	
	private MoneyBox money;
	private CoffeeTong coffee;
	private WaterTong water;
	private MilkTong milk;
	private CupTong cup;
	private IceTong ice;
	
	public Manager(CoffeeTong coffee, WaterTong water, MilkTong milk, CupTong cup, IceTong ice, MoneyBox moneybox) { //생성자
		this.coffee = coffee;
		this.water = water;
		this.milk = milk;
		this.cup = cup;
		this.ice = ice;
		this.money = moneybox;
	}
	
	static boolean waring = false; //재료가 부족할 경우 true(경고 실행)
	
	public void allWaring() { //각 재료 중 하나라도 부족하면 waring = true
		if (water.warwar() || milk.warmilk() || coffee.warcof() || ice.warice() || cup.warcup() || money.warmon()) {
			waring = true;
		} else {
			waring = false;
		}
	}
	
	
	Scanner scn = new Scanner(System.in);
	
	int addchoice=0; // 추가할 재료
	int add=0; //추가할 양
	
	boolean t = true;
	
	public void manager() {
		
		while(t) {
			try {
				System.out.println("\n\n관리자 모드입니다. \n수익 확인 : 0\n거스름돈 보충 : 1\n물 보충 : 2\n커피 보충 : 3\n우유 보충 : 4\n컵 보충 : 5\n얼음 보충 : 6\n관리자모드 종료 : 100");
				addchoice = scn.nextInt();
				
				if (addchoice == 0) {
					System.out.println("현재 수익: " + money.totalmoney + "원");
				} else if (addchoice == 1) {
					money.havingMoney();
					while (true) {
						System.out.println("거스름돈을 보충하시려면 (화폐종류) (추가할갯수) 형태로 입력하시오.\n관리자모드로 돌아가려면 '0'을 입력하시오");
						int moneyType = scn.nextInt(); // 추가할 동전 개수
						if (moneyType == 0) //뒤로가기
							break;
						add = scn.nextInt();
						money.insertMoney(moneyType, add);
					} 
				} else if (addchoice == 2) {
					System.out.println("잔여 물 양: " + water.water);
					System.out.println("추가할 물의 양을 입력하시오. 뒤로가시려면 0을 입력하시오");
					add = scn.nextInt();
					water.insertWater(add);
					 
				} else if (addchoice == 3) {
					System.out.println("잔여 커피 량: " + coffee.coffee);
					System.out.println("추가할 커피의 양을 입력하시오. 뒤로가시려면 0을 입력하시오");
					add = scn.nextInt();
					coffee.insertcoffee(add);
					 
				} else if (addchoice == 4) {
					System.out.println("잔여 우유량: " + milk.milk);
					System.out.println("추가할 우유의 양를 입력하시오. 뒤로가시려면 0을 입력하시오");
					add = scn.nextInt();
					milk.insertMilk(add);
					 
				} else if (addchoice == 5) {
					System.out.println("잔여 ice컵: " + cup.icecup + "\n잔여 hot컵: " + cup.hotcup);
					System.out.println("추가할 컵의 종류와 추가할 양을 입력하시오. 뒤로가시려면 0, 0을 입력하시오\nice컵 : 1\nhot컵 : 2");
					int cuptype = scn.nextInt();
					add = scn.nextInt();
					cup.insertCup(cuptype, add);
					 
				} else if (addchoice == 6) {
					System.out.println("잔여 얼음량: " + ice.ice);
					System.out.println("추가할 얼음의 개수를 입력하시오. 뒤로가시려면 0을 입력하시오");
					add = scn.nextInt();
					ice.insertice(add);
					 
				} else if (addchoice == 100) {
					System.out.println("관리자모드를 종료합니다.");
					break;
				} else {
					System.out.println("올바른 값을 입력하시오");
				}
			} 
			//정수 형태 이외 값 입력 시
			catch (Exception e) {
				System.out.println("올바른 값(숫자)을 입력하시오.");
				scn.nextLine(); //입력 지움
			}
		}
		
	}

}

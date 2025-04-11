package kr.ac.syu.java.chap4.third;
import java.util.Scanner;

//관리자 모드 클래스

public class Manager {
	
	static boolean waring = false; //재료가 부족할 경우 true(경고 실행)
	
	public static void allWaring() {
		if (WaterTong.warwar || MilkTong.warmilk || CoffeeTong.warcof || IceTong.warice || CupTong.warcup || MoneyBox.warmon) {
			waring = true;
		} else {
			waring = false;
		}
	}
	
	MoneyBox money = new MoneyBox();
	CoffeeTong coffee = new CoffeeTong();
	WaterTong water = new WaterTong();
	MilkTong milk = new MilkTong();
	CupTong cup = new CupTong();
	IceTong ice = new IceTong();
	
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
				}
				if (addchoice == 1) {
					money.havingMoney();
					while (true) {
						System.out.println("거스름돈을 보충하시려면 (화폐종류) (추가할갯수) 형태로 입력하시오.\n관리자모드로 돌아가려면 '1'을 입력하시오");
						int moneyType = scn.nextInt(); // 추가할 동전 개수
						if (moneyType == 1)
							break;
						add = scn.nextInt();
						money.insertMoney(moneyType, add);
					} 
				} else if (addchoice == 2) {
					System.out.println("추가할 물의 양을 입력하시오");
					add = scn.nextInt();
					water.insertWater(add);
					 
				} else if (addchoice == 3) {
					System.out.println("추가할 커피의 양을 입력하시오");
					add = scn.nextInt();
					coffee.insertcoffee(add);
					 
				} else if (addchoice == 4) {
					System.out.println("추가할 우유의 양를 입력하시오");
					add = scn.nextInt();
					milk.insertMilk(add);
					 
				} else if (addchoice == 5) {
					System.out.println("추가할 컵의 종류를 입력하시오\nice컵 : 1.\nhot컵 : 2");
					int cuptype = scn.nextInt();
					add = scn.nextInt();
					cup.insertMilk(cuptype, add);
					 
				} else if (addchoice == 6) {
					System.out.println("추가할 얼음의 개수를 입력하시오");
					add = scn.nextInt();
					ice.insertice(add);
					 
				} else if (addchoice == 100) {
					System.out.println("관리자모드를 종료합니다.");
					break;
				}
			} catch (Exception e) {
				System.out.println("올바른 값(숫자)을 입력하시오.");
			}
		}
		
	}

}

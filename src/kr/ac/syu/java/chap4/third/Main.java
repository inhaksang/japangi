package kr.ac.syu.java.chap4.third;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scn= new Scanner(System.in);
		 MachineEngine engine = new MachineEngine();
		 Menu menu = new Menu();
		 Manager manager = new Manager();
		 
		 int price = 0; //메뉴의 가격
		 int money; //총 들어간 돈
		 int insertMoney; //방금 들어간 돈
		 int icehot = 0;
		 
		 
		 while(true) {
			 try {
				 money = 0; //초기화
				 Manager.allWaring(); //재료 부족시 경고
				 
				 while(Manager.waring) { //경고 해제시까지 반복
					 System.out.println("재료 또는 거스름돈이 부족합니다");
					 manager.manager();
				 }
				 
				 System.out.println("\n\n메뉴를 선택하세요. 관리자 모드는 '100'을 입력하시오.");
				 System.out.println("아메리카노 : 1\n카페라떼 : 2\n우유 : 3");
				 int choice = scn.nextInt(); //입력받은 메뉴
			 
				 if (choice == 100) {
					 manager.manager();
				 
			 	 } else if (choice == 0) {
					 System.out.println("종료");
					 break;
				 } else if (choice == 1 || choice == 2 || choice ==3){
					 price = menu.findPrice(choice); //메뉴 별 가격 가져오기
				 } else {
					 System.out.println("올바른 값을 입력하시오");
					 continue;
				 }
				 
				 System.out.println("아이스, 핫 선택\n아이스 : 1\n핫 : 2");
				 icehot =0;
				 while(icehot != 1 && icehot!=2) {
					 icehot = scn.nextInt();
					 if (icehot != 1 && icehot!=2)
						 System.out.println("올바른 값을 입력하시오");
				 }
				 
				 System.out.println("현금을 투입하시오.");
				 
				 while (money < price) {
					 insertMoney = scn.nextInt(); //100, 500, 1000, 5000, 10000원권 입력
					 if (insertMoney == 100 || insertMoney == 500 || insertMoney == 1000 || insertMoney == 5000 || insertMoney == 10000) {
						 money += insertMoney;
						 System.out.println("투입 금액: " + money);
					 } else {
						 System.out.println("올바른 금액을 투입하시오");
					 }
					 
				 }
				 engine.processSelection(choice, icehot, money);
			 } catch (Exception e) {
				 System.out.println("올바른 값(숫자)을 입력하세요. ");
			 }
		 }
		 scn.close();
	}

}

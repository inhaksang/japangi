package kr.ac.syu.java.chap4.third;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scn= new Scanner(System.in);
		 MachineEngine engine = new MachineEngine();
		 Menu menu = new Menu();
		 Manager manager = new Manager();
		 
		 int price = 0; //메뉴의 가격
		 int money = 0; //총 들어간 돈
		 int insertMoney; //방금 들어간 돈
		 
		 
		 while(true) {
			 System.out.println("메뉴를 선택하세요");
			 System.out.println("1. 아메리카노\n2. 카페라떼 \n3. 바닐라라떼\n");
			 int choice = scn.nextInt(); //입력받은 메뉴
			 
			 try {
				 if (choice == 100) {
					 manager.manager();
				 
			 	 } else if (choice == 0) {
					 System.out.println("종료");
					 break;
				 } else {
					 price = menu.findPrice(choice);
				 }
				 
				 System.out.println("현금을 투입하시오.");
				 
				 while (money < price) {
					 insertMoney = scn.nextInt(); //100, 500, 1000, 5000, 10000원권 입력
					 if (insertMoney == 100 || insertMoney == 500 || insertMoney == 1000 || insertMoney == 5000 || insertMoney == 10000) {
						 money += insertMoney;
					 } else {
						 System.out.println("알맞은 금액을 투입하시오");
					 }
					 
				 }
				 engine.processSelection(choice, money);
			 } catch (Exception e) {
				 System.out.println("올바른 값(숫자)을 입력하세요. ");
			 }
		 }
		 scn.close();
	}

}

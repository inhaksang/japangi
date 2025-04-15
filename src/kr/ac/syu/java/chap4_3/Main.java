//2024100895 이재우
package kr.ac.syu.java.chap4_3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scn= new Scanner(System.in);
		 Menu menu = new Menu();

		 
		 int money; //총 들어간 돈
		 int price = 0; //메뉴의 가격
		 int insertMoney; //방금 들어간 돈
		 
		 int choice = 0;
		 int icehot = 0;
		 
		 System.out.println("자판기 부팅 완료.");
		 
		 
		 //try문 안에서 쓰기 위해 미리 선언
		 FormatMachine format; //초기값 설정 위한 객체 생성, 계속 이걸로 생성한 객체를 쓸거임
		 CoffeeTong coffeetong;
		 WaterTong watertong;
		 MilkTong milktong;
		 IceTong icetong;
		 CupTong cuptong;
		 MoneyBox moneybox;
		 MachineEngine engine = null;
		 Manager manager = null;//초기화 안된 로컬 변수 사용 못함

		 
		 try {
			 System.out.println("초기 재료 값을 입력하시오.\n\n\n커피, 물, 우유, 얼음, 아이스컵, 핫컵 순으로 정수값을 입력하시오");
			 
			 int[] firstadd = new int[6];
			 
			 for (int i=0 ; i<6 ; i++) {
				 firstadd[i] = scn.nextInt();
				 if (firstadd[i] < 0)
					 firstadd[i] = 0;
			 }
			 
			 System.out.println("거스름돈 갯수 초기값을 입력하시오.\n100원, 500원, 1000원, 5000원 순으로 입력하시오");
			 
			 int[] firstmoney = new int[4];
			 
			 for (int i=0 ; i<4 ; i++) {
				 firstmoney[i] = scn.nextInt();
				 if (firstmoney[i] < 0)
					 firstmoney[i] = 0;
			 }
			 
			 format = new FormatMachine(firstadd, firstmoney);
			 coffeetong = format.getCoffee();
			 watertong = format.getWater();
			 milktong = format.getMilk();
			 icetong = format.getIce();
			 cuptong = format.getCup();
			 moneybox = format.getMoney();
			 
			 engine = new MachineEngine(coffeetong, watertong, milktong, cuptong, icetong, moneybox);
			 manager = new Manager(coffeetong, watertong, milktong, cuptong, icetong, moneybox);
			 
		 } catch (Exception e) {
			 System.out.println("올바른 값(정수)을 입력하시오");
		 }
		 

		 while(true) {
			 
			 try {
				 money = 0; //초기화
				 manager.allWaring(); //재료 부족시 경고
				 
				 while(Manager.waring) { //경고 해제시까지 반복
					 System.out.println("\n\n경고: 재료 또는 거스름돈이 부족합니다");
					 manager.manager();
					 manager.allWaring();
				 }
				 
				 System.out.println("\n\n메뉴를 선택하세요. 관리자 모드는 '100'을 입력하시오.");
				 System.out.println("아메리카노 : 1\n카페라떼 : 2\n우유 : 3");
				 choice = scn.nextInt(); //입력받은 메뉴
			 
				 if (choice == 100) {
					 manager.manager();
					 continue;
				 
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
						 System.out.println("지폐 또는 동전을 투입하시오");
					 }
					 
				 }
				 engine.processSelection(choice, icehot, money);
			 } catch (Exception e) {
				 System.out.println("올바른 값(숫자)을 입력하세요. ");
				 scn.nextLine(); // 해당 줄 입력 버퍼 비움
			 }
		 }
		 scn.close();
	}

}

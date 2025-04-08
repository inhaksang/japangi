package kr.ac.syu.java.chap4.third;
import java.util.Scanner;

public class Manager {
	
	MoneyBox money = new MoneyBox();
	
	Scanner scn = new Scanner(System.in);
	
	int addchoice; // 추가할 재료
	int add; //추가할 양
	
	public void manager() {
		
		while(true) {
			try {
				System.out.println("관리자 모드입니다. \n1. 거스름돈 보충\n 2. 물 보충\n3. 커피 보충\n4. 컵 보충\n5. 얼음 보충\n100. 관리자모드 종료");
				addchoice = scn.nextInt();
				if (addchoice == 1) {
					System.out.println("(화폐종류 추가할갯수) 형태로 입력하시오.");
					int moneyType = scn.nextInt(); // 추가할 동전 개수
					add = scn.nextInt();
					money.
					 
				} else if (addchoice == 2) {
					System.out.println("추가할 물의 양을 입력하시오");
					add = scn.nextInt();
					 
				} else if (addchoice == 3) {
					System.out.println("추가할 커피의 양을 입력하시오");
					add = scn.nextInt();
					 
				} else if (addchoice == 4) {
					System.out.println("추가할 컵의 개수를 입력하시오");
					add = scn.nextInt();
					 
				} else if (addchoice == 5) {
					System.out.println("추가할 얼음의 개수를 입력하시오");
					add = scn.nextInt();
					 
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

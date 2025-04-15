//2024100903 정우영
//커피 통
package kr.ac.syu.java.chap4_3;
import java.util.Scanner;

public class CoffeeTong {
	int coffee; //커피 잔여량
	
	
	//기본 생성자
	public CoffeeTong() {} 
	
	//초기값 설정용 생성자
	public CoffeeTong(int coffee) {
		this.coffee = coffee;
	}
	
	
	
	public boolean warcof() {
		return (coffee < 50) ? true : false; //커피 부족 시 true
	}
	
	public void insertcoffee(int add) { //커피 추가
		Scanner scn = new Scanner(System.in);
		
		while (add<50) {
			if (add == 0) { //뒤로가기
				break;
			}
			System.out.println("최소 50 이상을 입력하시오");
			add = scn.nextInt();
		}
		if (add == 0) { //뒤로가기
			;
		} else {
			System.out.println("커피가 "+add +" 만큼 추가되었습니다.");
			coffee += add;
		}
		warcof();
	}

	public void coffeetong(int menu) { //커피 사용
		if (menu == 1) {
			coffee -= 50;
		} else if (menu == 2) {
			coffee -= 30;
		}
		warcof();
	}
}

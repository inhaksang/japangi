//2024100895 이재우
package kr.ac.syu.java.chap4.third;
import java.util.Scanner;

public class CoffeeTong {
	static int coffee = 1000; //커피 잔여량
	static boolean warcof = false; //커피 부족 시 true
	
	public void insertcoffee(int add) { //커피 추가
		Scanner scn = new Scanner(System.in);
		
		while (add<50) {
			System.out.println("최소 50 이상을 입력하시오");
			add = scn.nextInt();
		}
		coffee += add;
		
		if (coffee >= 50)
			warcof = false; //경고 해제
	}

	public void coffeetong(int menu) { //커피 사용
		if (menu == 1) {
			coffee -= 50;
		} else if (menu == 2) {
			coffee -= 30;
		}
		if (coffee < 50) {
			warcof = true; //경고 실행
		}
	}
}

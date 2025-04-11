//2024100895 이재우
package kr.ac.syu.java.chap4.third;
import java.util.Scanner;

public class MilkTong {
	static int milk = 1000; //우유 잔여량
	static boolean warmilk = false; //우유 부족 시 true
	
	public void insertMilk(int add) { //우유 추가
		Scanner scn = new Scanner(System.in);
		
		while (add<100) {
			System.out.println("최소 100 이상을 입력하시오");
			add = scn.nextInt();
		}
		milk += add;
		
		if (milk >= 100)
			warmilk = false; //경고 해제
	}

	public void milktong(int menu) { //우유 사용
		if (menu == 2) {
			milk -= 60;
		} else if (menu == 3) {
			milk -= 100;
		}
		if (milk < 100) {
			warmilk = true; //경고 실행
		}
	}
}

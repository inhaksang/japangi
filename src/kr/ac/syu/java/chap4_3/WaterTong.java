//2024100863 김유민
//물 통
package kr.ac.syu.java.chap4_3;
import java.util.Scanner;

public class WaterTong {
	static int water = 1000; //물 잔여량
	static boolean warwar = false;
	
	public void insertWater(int add) { //물 추가
		Scanner scn = new Scanner(System.in);
		
		while (add<100) { 
			if (add == 0) { //뒤로가기
				break;
			}
			System.out.println("최소 100 이상을 입력하시오");
			add = scn.nextInt();
		}
		if (add == 0) { //뒤로가기
			;
		} else {
			System.out.println("물이 "+add +" 만큼 추가되었습니다.");
			water += add;
		}
		if (water >= 100) {
			warwar = false;
			Manager.allWaring();
		}
	}

	public void watertong(int menu) { //물 사용
		if (menu == 1) {
			water  -= 100;
		}
		if (water < 100) {
			warwar = true;//경고 실행
		}
	}

}

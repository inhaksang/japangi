//2024100895 이재우
package kr.ac.syu.java.chap4.third;
import java.util.Scanner;

public class WaterTong {
	static int water = 1000; //물 잔여량
	static boolean warwar = false;
	
	public void insertWater(int add) { //물 추가
		Scanner scn = new Scanner(System.in);
		
		while (add<100) {
			System.out.println("최소 100 이상을 입력하시오");
			add = scn.nextInt();
		}
		water += add;
		if (water >= 100) 
			warwar = false;
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

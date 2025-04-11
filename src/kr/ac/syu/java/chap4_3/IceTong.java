//2024100863 김유민
//얼음 통
package kr.ac.syu.java.chap4_3;

import java.util.Scanner;

public class IceTong {
	static int ice = 100; //얼음 잔여량
	static boolean warice = false; //얼음 부족 시 true
	
	public void insertice(int add) { //얼음 추가
		Scanner scn = new Scanner(System.in);
		
		while (add<10) {
			if (add == 0) { //0을 누르면 뒤로가기
				break;
			}
			System.out.println("최소 10 이상을 입력하시오");
			add = scn.nextInt();
		}
		if (add == 0) { //뒤로가기
			;
		} else {
			System.out.println("얼음이 "+add +" 만큼 추가되었습니다.");
			ice += add;
		}
		if (ice >= 10) {
			warice = false; //경고 해제
			Manager.allWaring();
		}
	}

	public void icetong(int icehot) { //얼음 사용
		if (icehot == 1) {
			ice -= 10;
		} 
		if (ice < 10) {
			warice = true; //경고 실행
		}
	}

}

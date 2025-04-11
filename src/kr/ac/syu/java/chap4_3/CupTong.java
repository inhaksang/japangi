//2024100903 정우영
//컵 통
package kr.ac.syu.java.chap4_3;

import java.util.Scanner;

public class CupTong {
	static int icecup = 50, hotcup = 50; //컵 잔여개수
	static boolean warcup = false; //컵 부족 시 true
	
	public void insertCup(int type, int add) { //컵 추가
		Scanner scn = new Scanner(System.in);
		//아이스컵
		if (type == 1) {
			// 1이상 입력시까지 반복
			while (add<1) {
				if (add == 0) {
					break;
				}
				if (add == 0) { //뒤로가기
					;
				} else {
					System.out.println("최소 1 이상을 입력하시오");
					add = scn.nextInt();
				}
			}
			System.out.println("ice컵이 "+add +" 만큼 추가되었습니다.");
			icecup += add;
		}
		//핫 컵
		else if (type == 2) {
			// 1 이상 입력시까지 반복
			while (add<1) {
				if (add == 0) { //뒤로가기
					break;
				}
				System.out.println("최소 1 이상을 입력하시오");
				add = scn.nextInt();
			}
			if (add == 0) { //뒤로가기
				;
			} else {
				System.out.println("hot컵이 "+add +" 만큼 추가되었습니다.");
				hotcup += add;
			}
		} else {
			System.out.println("올바른 값을 입력하시오"); //1, 2 이외 값 입력시
		}
		if (icecup >= 1 && hotcup >= 1) {
			warcup = false; //경고 해제
			Manager.allWaring();
		}
	}

	public void cuptong(int icehot) { //컵 사용
		if (icehot == 1) {
			icecup -= 1;
			if (icecup < 1) {
				warcup = true; //경고 실행
			}
		} else if (icehot == 2) {
			hotcup -= 1;
			if (hotcup < 1) {
				warcup = true; //경고 실행
			}
		}
	}

}

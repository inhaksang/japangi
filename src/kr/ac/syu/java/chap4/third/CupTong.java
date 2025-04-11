package kr.ac.syu.java.chap4.third;

import java.util.Scanner;

public class CupTong {
	static int icecup = 50, hotcup = 50; //컵 잔여개수
	static boolean warcup = false; //컵 부족 시 true
	
	public void insertMilk(int type, int add) { //컵 추가
		Scanner scn = new Scanner(System.in);
		if (type == 1) {
			while (add<1) {
				System.out.println("최소 1 이상을 입력하시오");
				add = scn.nextInt();
			}
			icecup += add;
		} else if (type == 2) {
			while (add<1) {
				System.out.println("최소 1 이상을 입력하시오");
				add = scn.nextInt();
			}
			hotcup += add;
		} else {
			System.out.println("올바른 값을 입력하시오");
		}
		if (icecup >= 1 && hotcup >= 1)
			warcup = false; //경고 해제
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

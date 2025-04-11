package kr.ac.syu.java.chap4.third;

import java.util.Scanner;

public class IceTong {
	static int ice = 100; //얼음 잔여량
	static boolean warice = false; //얼음 부족 시 true
	
	public void insertice(int add) { //얼음 추가
		Scanner scn = new Scanner(System.in);
		
		while (add<10) {
			System.out.println("최소 10 이상을 입력하시오");
			add = scn.nextInt();
		}
		ice += add;
		
		if (ice >= 10)
			warice = false; //경고 해제
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

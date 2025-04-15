//2024100863 김유민
//얼음 통
package kr.ac.syu.java.chap4_3;

import java.util.Scanner;

public class IceTong {
	
	int ice; //얼음 잔여량
	
	//기본 생성자
	public IceTong() {}
	
	//초기값 설정춍 생성자
	public IceTong(int ice) {
		this.ice = ice;
	}
	
	
	
	public boolean warice() {
		return (ice < 10) ? true : false;
	}
	
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
		warice();
	}

	public void icetong(int icehot) { //얼음 사용
		if (icehot == 1) {
			ice -= 10;
		}
		warice();

	}

}

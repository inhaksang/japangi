//2024100903 정우영
//컵 통
package kr.ac.syu.java.chap4_3;

import java.util.Scanner;

public class CupTong {
	int icecup=0;
	int hotcup=0; //컵 잔여개수
	
	
	
	//기본 생성자
	public CupTong() {}
	
	//초기값용 생성자
	public CupTong(int icecup, int hotcup) {
		this.icecup = icecup;
		this.hotcup = hotcup;
	}
	
	
	
	public boolean warcup() {
		return (icecup<1 || hotcup<1) ? true : false; //컵 부족 시 true
	}
	
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
		warcup();
	}

	public void cuptong(int icehot) { //컵 사용
		if (icehot == 1) {
			icecup -= 1;
		} else if (icehot == 2) {
			hotcup -= 1;
		}
		warcup();
	}

}

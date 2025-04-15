//2024100863 김유민
//우유 통
package kr.ac.syu.java.chap4_3;
import java.util.Scanner;

public class MilkTong {
	int milk; //우유 잔여량
	
	
	
	//기본 생성자
	public MilkTong() {}
	
	//초기값 설정용 생성자
	public MilkTong(int milk) {
		this.milk = milk;
	}
	
	
	
	public boolean warmilk() {
		return (milk < 100) ? true : false; //우유 부족 시 true
	}
	
	public void insertMilk(int add) { //우유 추가
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
			milk += add;
			System.out.println("우유가 "+add +" 만큼 추가되었습니다.");
		}
		warmilk();
	}

	public void milktong(int menu) { //우유 사용
		if (menu == 2) {
			milk -= 60;
		} else if (menu == 3) {
			milk -= 100;
		}
		warmilk();
	}
}

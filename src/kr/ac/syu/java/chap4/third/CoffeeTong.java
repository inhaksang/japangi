package kr.ac.syu.java.chap4.third;

public class CoffeeTong {
	
	private int coffeeAmount;

    // 기본 
    public CoffeeTong() {
        this.coffeeAmount = 1000;
    }

    // 커피 사용
    public boolean useCoffee(int amount) {
        if (coffeeAmount >= amount) {
            coffeeAmount -= amount;
            System.out.println("커피 " + amount + "g 사용. " + coffeeAmount + "g 남음.");
            return true;
        } else {
            System.out.println("커피가 부족해요!!!!! 현재 남은 양: " + coffeeAmount + "g");
            return false;
        }
    }

    // 커피 추가
    public void addCoffee(int amount) {
        if (amount > 0) {
            coffeeAmount += amount;
            System.out.println(amount + "g 추가. 현재 총량: " + coffeeAmount + "g");
        }
    }

    // 현재 커피 양
    public int getCoffeeAmount() {
        return coffeeAmount;
    }

}

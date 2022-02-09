// 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제
//가능한 한 적은 수의 동전으로 거슬러 주어야 한다 

class Exercise5_6 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length ;i++) {
			System.out.println(coinUnit[i]+"원: "+money/coinUnit [i]);
			money = money%coinUnit[i];
		}
	}
}
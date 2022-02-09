//배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서 그래프를 그리는 프로그램

class Exercise5_8 {
	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];  //1부터 4까지의 데이터를 집계할 것이기 때문에 크기가 4인 배열 생성 
		
		for(int i=0;i<answer.length;i++) {
			counter[answer[i]-1]++; 
		} //크기가 4이지만 배열 index는 0~3이기 때문에 answer[i]에서 1을 빼줘야 함 
		for(int i=0;i<counter.length;i++) {
			System.out.print((i+1)+"의 개수:"+counter[i]);
			
			for(int j=0;j<counter[i];j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

//counter[answer[i]-1]++;
//배열 counter에서, 배열 answer에 저장된 값과 일치하는 인덱스의 요소에 저장된 값을 1증가시킨다. 
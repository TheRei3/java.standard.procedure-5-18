package ex5no18;

public class ex5no18 {  // 218p
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		int sum = 0;
		
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
			}  // for( j )
		}  //for( i )
		
		for(int[] tmp : score) {
			for(int i : tmp) {
				sum += i;
			}
		}
		
		System.out.println("sum = "+sum);
	}  //main

}

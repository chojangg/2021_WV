package test_arr1;

public class Array2Test {

	public static void main(String[] args) {

		String[][] favs = {{"닭","강아지","토끼","사자"},{"사과","바나나","귤","키위"},{"봄","여름","가을","겨울"}};

		for(int i=0; i<favs.length; i++) {
			for(int j=0; j<favs[i].length; i++) {
				System.out.print(favs[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] favs2 = new int[3][2];
		
//		favs2[0][0] = 10; favs2[0][1] = 20;
//		favs2[1][0] = 30; favs2[1][1] = 40;
//		favs2[2][0] = 50; favs2[2][1] = 60;
		
		int count=1;
		for(int i=0; i<favs2.length; i++) {
			for(int j=0; j<favs2.length; j++) {
				favs2[i][j]=count++ * 10;
			}
		}
		
		for(int i=0; i<favs2.length; i++) {
			for(int j=0; j<favs2.length; j++) {
				System.out.print(favs2[i][j]+" ");
			}
			System.out.println();
		}
	}

}

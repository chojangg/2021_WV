package test_arr2;

import java.util.Scanner;
public class DynamicScore {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] student = {"1","2","3","4","5"};
		int[][] score = new int[student.length][];
		for(int i=0; i<student.length; i++) {
			System.out.print(student[i]+"의 과목수 입력 : ");
			int num=scan.nextInt();
			score[i] = new int[num];
		}
		int[] sum = new int[student.length];
		double[] avg = new double[student.length];
		System.out.println();
		for(int i=0; i<student.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(student[i]+"의 "+(i+1)+"번째 점수 입력 : ");
				score[i][j]=scan.nextInt();
				sum[i]+=score[i][j];
			}
		}
		
		for(int i=0; i<student.length; i++) {
			System.out.print(student[i]+" : ");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.print("  "+sum[i]);
			System.out.println();
		}
	}

}

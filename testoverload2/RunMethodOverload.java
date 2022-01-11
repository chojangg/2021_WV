package testoverload2;

import java.util.Scanner;
public class RunMethodOverload {

	public static void main(String[] args) {
		MethodOverloadTest ot = new MethodOverloadTest();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 수의 덧셈");
		System.out.print("첫번째 수 입력 : ");
		int n1 = scan.nextInt();
		System.out.print("두번째 수 입력 : ");
		int n2 = scan.nextInt();
		System.out.printf("%d + %d = %d\n", n1, n2, ot.calc(n1, n2));
		
		System.out.println();
		System.out.println("두 수의 곱셈");
		System.out.print("첫번째 수 입력 : ");
		double n3 = scan.nextDouble();
		System.out.print("두번째 수 입력 : ");
		double n4 = scan.nextDouble();
		System.out.printf("%.1f * %.1f = %.3f\n", n3, n4, ot.calc(n3, n4));

	}

}

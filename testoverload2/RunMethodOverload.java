package testoverload2;

import java.util.Scanner;
public class RunMethodOverload {

	public static void main(String[] args) {
		MethodOverloadTest ot = new MethodOverloadTest();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ���� ����");
		System.out.print("ù��° �� �Է� : ");
		int n1 = scan.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int n2 = scan.nextInt();
		System.out.printf("%d + %d = %d\n", n1, n2, ot.calc(n1, n2));
		
		System.out.println();
		System.out.println("�� ���� ����");
		System.out.print("ù��° �� �Է� : ");
		double n3 = scan.nextDouble();
		System.out.print("�ι�° �� �Է� : ");
		double n4 = scan.nextDouble();
		System.out.printf("%.1f * %.1f = %.3f\n", n3, n4, ot.calc(n3, n4));

	}

}

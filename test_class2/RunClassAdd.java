package test_class2;

public class RunClassAdd {

	public static void main(String[] args) {

		ClassAdd a1 = new ClassAdd();
		ClassAdd a2 = new ClassAdd();
		
		a1.setN1(10);
		a1.setN2(20);
		a1.addNum();
		
		System.out.printf("%d + %d = %d\n", a1.getN1(), a1.getN2(), a1.getResult());
//		System.out.println("a1.rest = "+a1.getResult());
		
		a2.setN1(150);
		a2.setN2(200);
		a2.addNum();
		
		System.out.printf("%d + %d = %d\n", a2.getN1(), a2.getN2(), a2.getResult());
//		System.out.println("a2.rest = "+a2.getResult());

	}

}

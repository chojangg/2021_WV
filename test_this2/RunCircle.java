package test_this2;

public class RunCircle {

	public static void showPrint(Circle c) {
		System.out.printf("반지름이 %d㎝인 원의 둘레는 %.2f㎠\n", c.getR(), c.getCircum());
		System.out.printf("반지름이 %d㎝인 원의 면적은 %.2f㎠\n", c.getR(), c.getArea());
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(15);
		c1.showInfo();
		Circle c2 = new Circle(6);
		c2.showInfo();

	}

}

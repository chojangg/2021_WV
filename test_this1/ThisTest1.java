package test_this1;

public class ThisTest1 {

	private int n;
	
	public void power(int n) {
		n = n * n;
		System.out.printf("%dÀÇ Á¦°ö½ÂÀº %dÀÌ´Ù.\n", n, this.n);
	}
	
	public int power(int x, int y) {
		n = 1;
		
		for(int i=0; i<y; i++) {
			n *= x;
		}
		
		return n;
	}
}

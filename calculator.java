package week1.day2;

public class calculator {
	public void addTwoNumber(int m,int n) {
	int x=m+n;
	System.out.println(x);
	}
	public void subtractTwoNumber(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public void multiplyTwoNumber(int s,int h) {
		int w=s*h;
		System.out.println(w);
	}
	public void divideTwoNumber(int r,int o) {
		int v=r/o;
		System.out.println(v);
	}
	public static void main(String[] args) {
		calculator calc=new calculator();
		calc.addTwoNumber(46, 50);
		calc.subtractTwoNumber(900, 500);
		calc.multiplyTwoNumber(45, 12);
		calc.divideTwoNumber(546, 45);
	}
	
	

}

package java_fund_module;

public class JavaVariables_andDataTypes {
	static void q1() {
		int x = 2;
		int y = 4;
		System.out.println(x * y);
	}
	static void q2() {
		char c = 'U';
		int ascii = c;
		System.err.println(ascii);
	}
	static void q3() {
		int len = 7;
		int breadth = 4;
		System.out.println(len * breadth);
	}
	static void q4() {
		int num = 4;
		System.out.println(num * num * num);
	}
	static void q5() {
		int a = 2;
		int b= 3;
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q1();
		q2();
		q3();
		q4();
		q5();
	}

}

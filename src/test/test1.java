package test;

public class test1 {
	public static void main(String[] args) {
		int num = 5;
		int numA = 1;
		for (int i = 1; i <= num; i++) {
			numA *= i;
		}
		System.out.println(numA);
		
		int x = 10, y = 20;
		int z;
		
		z = x;
		x = y;
		y = z;
		System.out.println(x);
		System.out.println(y);
		
		String a = "제발 나오라";
		a = a.replace("나오라", "나오지마라");
		System.out.println(a);
	}
}
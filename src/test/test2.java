package test;

import java.util.Iterator;

public class test2 {

	public static void main(String[] args) {

		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <=5; j++) {
			System.out.print("*");
		}
			System.out.println();
		}
		
		int x = 10, y = 20;
		int z;
		
		z = x;
		x = y;
		y = z;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

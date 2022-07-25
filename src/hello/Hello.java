package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello world!");
		Scanner in=new Scanner(System.in);
		int inch;
		int inc;
		double hight;
//		System.out.println(in.nextLine());
//		int value=in.nextInt();
		inch=in.nextInt();
		inc=in.nextInt();
		System.out.println((int)((inch+inc/12.0)*0.3048*100)+"cm");

	}

}

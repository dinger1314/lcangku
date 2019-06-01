package 方法;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 1.自定义方法，键盘录入两个数，返回较大值
		//2.自定义方法，键盘录入两个数，比较是否相等
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int a = sc.nextInt();
		System.out.println("请输入另一个数：");
		int b=sc.nextInt();
        max(a, b);
        System.out.println(max1(a, b));
        System.out.println(is相等(a, b));
        System.out.println("");
        is相等1(a, b);
	}
	public static void max(int a,int b) {
		System.out.println(a>b?a:b);
	}
	public static int max1(int a,int b) {
		return a>b?a:b;
	}
	
	public static String is相等(int a,int b) {
		return a==b?"相等":"不相等";
	}
	public static void is相等1(int a,int b) {
		System.out.println(a==b?"相等":"不等");
	}
	

}

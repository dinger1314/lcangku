package ����;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 1.�Զ��巽��������¼�������������ؽϴ�ֵ
		//2.�Զ��巽��������¼�����������Ƚ��Ƿ����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();
		System.out.println("��������һ������");
		int b=sc.nextInt();
        max(a, b);
        System.out.println(max1(a, b));
        System.out.println(is���(a, b));
        System.out.println("");
        is���1(a, b);
	}
	public static void max(int a,int b) {
		System.out.println(a>b?a:b);
	}
	public static int max1(int a,int b) {
		return a>b?a:b;
	}
	
	public static String is���(int a,int b) {
		return a==b?"���":"�����";
	}
	public static void is���1(int a,int b) {
		System.out.println(a==b?"���":"����");
	}
	

}

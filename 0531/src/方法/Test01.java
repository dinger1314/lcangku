package ����;

public class Test01 {

	public static void main(String[] args) {
		//���������ĺ�
          //1.ֱ�ӵ���
		sum1(2, 3);//ʵ��
		//2.�������
		System.out.println(sum(2, 3));
		//3.��ֵ����
		int sum =sum(2,3);
		System.out.println(sum);
		
	}
	
	public static int sum(int n,int m) {//�β� ռλ
		System.out.println(m+n);
		sum1(4, 5);
		System.out.println();
		return n+m;
	}
	
	public static void sum1(int n,int m) {
		System.out.println(n+m);
	}

}

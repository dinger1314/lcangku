package ��ҵ;

public class Test04 {

	public static void main(String[] args) {
		// �žų˷���
		
		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */
//		for(int i=1;i<=5;i++) {//��
//			for(int j=1;j<=i;j++) {//��
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=9;i++) {//��
//			i=1  i=2
			for(int j=1;j<=i;j++) {//��
//				j=1
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}

	}

}

package 作业;

public class Test04 {

	public static void main(String[] args) {
		// 九九乘法表
		
		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */
//		for(int i=1;i<=5;i++) {//行
//			for(int j=1;j<=i;j++) {//列
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=9;i++) {//行
//			i=1  i=2
			for(int j=1;j<=i;j++) {//列
//				j=1
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}

	}

}

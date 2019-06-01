package 方法;

public class Test01 {

	public static void main(String[] args) {
		//求两个数的和
          //1.直接调用
		sum1(2, 3);//实参
		//2.输出调用
		System.out.println(sum(2, 3));
		//3.赋值调用
		int sum =sum(2,3);
		System.out.println(sum);
		
	}
	
	public static int sum(int n,int m) {//形参 占位
		System.out.println(m+n);
		sum1(4, 5);
		System.out.println();
		return n+m;
	}
	
	public static void sum1(int n,int m) {
		System.out.println(n+m);
	}

}

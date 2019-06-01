package 作业;

public class Test01 {

	public static void main(String[] args) {
		// 5. 求1----100里，能被6整除且能被9整除的数的和。
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%6==0 && i%9==0)
				sum+=i;
		}
System.out.println(sum);
	}

}

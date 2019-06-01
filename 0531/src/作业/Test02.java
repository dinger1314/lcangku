package 作业;

public class Test02 {

	public static void main(String[] args) {
		// 6. 求1/2+1/3+1/4+1/5……1/10  的和。
		double sum=0;
		for(int i=2;i<=10;i++) {
			sum+=1/i;
		}
          System.out.println(sum);
	}

}

package ��ҵ;

public class Test01 {

	public static void main(String[] args) {
		// 5. ��1----100��ܱ�6�������ܱ�9���������ĺ͡�
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%6==0 && i%9==0)
				sum+=i;
		}
System.out.println(sum);
	}

}

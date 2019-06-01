package 随机数;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //[0~1)   1~10   0~99   3~9   3~10
		System.out.println((int)(Math.random()*10+1));
		System.out.println((int)(Math.random()*100));
		//公式：(int)(Math.random()*（大-小+1）+小)
	}

}

package ��ת���;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break; ������ǰѭ�� ���ٽ����´�ѭ��
		//continue;��������ѭ���������´�ѭ��
		/*
		 * for(int i=1;i<=10;i++) { if(i==5) continue; //break;
		 * System.out.print(i+"  "); }
		 */
           
           a:for(int i=1;i<=10;i++) {
        	   for(int j=1;j<=10;j++) {
        		   if(i==5)
        			   break a;
        		   System.out.println("i:"+i+" j:"+j+"\t");
        	   }
           }
	}

}

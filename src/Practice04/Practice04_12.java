package Practice04;

public class Practice04_12 {
	public static void main(String[] args) {
		//�������� �Ϻκ��� ������ ���� ����Ͻÿ�
		int a=2;
		int j=0;
		while(a<9){
			for(int i=1;i<=3;i++){
				for(j=a;j<=a+2;j++){
					if(j==10)break;
					System.out.print(j+"*"+i+"="+i*j+"\t");					
				}
				System.out.println();
			}
			System.out.println();
			a=j;
		}
	}
}

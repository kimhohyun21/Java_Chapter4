package Practice;

public class Practice06 {
	public static void main(String[] args) {
		//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램
		int x[]={1, 2, 3, 4, 5, 6};
		int y[]={1, 2, 3, 4, 5, 6};
		int sum=6;
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<y.length;j++){
				if(sum==x[i]+y[j]){
					System.out.println("("+x[i]+", "+y[j]+")");
				}
			}
		}
	}
}

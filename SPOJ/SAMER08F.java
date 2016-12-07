import java.util.*;

class SAMER08F {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			if(n==0)
				break;
			int sum = 1;
			for(int i=2;i<=n;i++){
				sum = sum + i*i;
			}
			System.out.println(sum);
		}
	}
}

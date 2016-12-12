import java.util.*;
class AE00 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num==1){
			System.out.println(1);
			return;
		}

		int sum = num;
		for(int i=2;i*i<=num;i++){
			int j = i+1;
			for(j=i+1;j*i<=num;j++){
			}
			sum += j - i ;
		}
		System.out.println(sum);
	}
}
import java.util.*;
class PRIME1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		for(int count_index=0;count_index<count;count_index++){
			int low = scan.nextInt();
			int high = scan.nextInt();
			if(low<2)
				low = 2;
			for(int i=low;i<=high;i++){
				if(isPrime(i))
					System.out.println(i);
			}
		}
	}
	static boolean isPrime(int n){
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		int thres = 5;
		while(thres<=(int)Math.sqrt(n)){
			if(n%thres==0||n%(thres+2)==0)
				return false;
			thres+=6;
		}
		return true;
	}
}

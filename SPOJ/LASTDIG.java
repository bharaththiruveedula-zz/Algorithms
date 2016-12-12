import java.util.*;
import java.math.BigInteger;
import java.lang.Math;
class LASTDIG{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		//BigInteger base = new BigInteger("10");
		while(count-->0){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(b==0){
				System.out.println(1);
				continue;
			}
			else if(a==0){
				System.out.println(0);
				continue;
			}else{
				b %= 4;
				if(b==0)
					b=4;
				int res = (int)Math.pow(a, b)%10;
				System.out.println(res%10);
			}
		}
	}
}
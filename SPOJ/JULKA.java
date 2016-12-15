import java.math.BigInteger;
import java.util.*;
class JULKA{
	public static void main(String[] args){
		Scanner scan =  new Scanner(System.in);
		int count = 10;
		while(count-->0){
			BigInteger total = scan.nextBigInteger();
			BigInteger ahead = scan.nextBigInteger();
			BigInteger a = new BigInteger("0");
			BigInteger b = new BigInteger("0");
			if(total.mod(new BigInteger("2"))==BigInteger.ZERO){
				a = total.divide(new BigInteger("2"));
				b = total.divide(new BigInteger("2"));
				ahead = ahead.divide(new BigInteger("2"));
				a = a.add(ahead);
				b = b.subtract(ahead);
				System.out.println(a);
				System.out.println(b);
				continue;
			}
			else{
				a = total.divide(new BigInteger("2"));
				b = total.subtract(a);
				if(ahead==BigInteger.ONE){
					if(a.compareTo(b)==-1){
						System.out.println(b);
						System.out.println(a);
						continue;
					}
					else{
						System.out.println(a);
						System.out.println(b);
						continue;

					}
				}
				else{
					ahead = ahead.subtract(BigInteger.ONE).divide(new BigInteger("2"));
					b = b.add(ahead);
					a = a.subtract(ahead);
					System.out.println(b);
					System.out.println(a);
					continue;
				}
			}
		}
	}
}

import java.util.*;
import java.math.BigInteger;
class EIGHTS {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		while(count-->0){
			BigInteger num = scan.nextBigInteger();
			num = num.subtract(BigInteger.ONE);
			num = num.multiply(new BigInteger("250")).add(new BigInteger("192"));
			System.out.println(num);
		}
	}
}

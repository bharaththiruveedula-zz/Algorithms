import java.util.*;
import java.math.BigInteger;
class CANDY3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		while(count-->0){
			scan.nextLine();
			BigInteger num = scan.nextBigInteger();
			BigInteger temp = BigInteger.ZERO;
			for(BigInteger i = BigInteger.ZERO;i.compareTo(num)<0; i=i.add(BigInteger.ONE)){
				temp =temp.add(scan.nextBigInteger());
			}
			if(temp.mod(num)==BigInteger.ZERO){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}

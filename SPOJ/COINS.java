import java.util.*;
import java.math.BigInteger;

class COINS {
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
		   BigInteger num = scan.nextBigInteger(); 	
		   HashMap<BigInteger, BigInteger> map = new HashMap<BigInteger, BigInteger>();
		   map.put(BigInteger.ZERO, BigInteger.ZERO);
		   map.put(BigInteger.ONE, BigInteger.ONE);
		   System.out.println(calculateCost(num, map));
		}
	}
	static BigInteger calculateCost(BigInteger num, HashMap<BigInteger, BigInteger> map){
		if(map.containsKey(num)){
			return map.get(num);
		}
		BigInteger a = num.divide(new BigInteger("2"));
		BigInteger b = num.divide(new BigInteger("3"));
		BigInteger c = num.divide(new BigInteger("4"));
		if(num.compareTo(a.add(b).add(c))>=0){
			map.put(num, num);
			return num;
		} else{
			BigInteger temp = calculateCost(a, map).add(calculateCost(b, map)).add(calculateCost(c, map));
			map.put(num, temp);
			return temp;
		}
	}
}

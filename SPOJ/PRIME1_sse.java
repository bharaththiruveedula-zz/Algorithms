import java.util.*;

class PRIME1_sse{
	static List<Integer> simpleSieve(int limit){
		List<Integer> list = new LinkedList<Integer>();
		int[] arr = new int[limit];
		for(int i=2;i<limit;i++){
			if(arr[i]==0){
				for(int j=i*2; j<limit; j=j+i){
					arr[j] = 1;
				}
			}
		}
		for(int i=2;i<limit;i++){
			if(arr[i]==0){
				list.add(i);
			}
		}
		return list;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int prime;
		List<Integer> primes = simpleSieve(32000);
		for(int i=0; i<count; i++){
			int beg = scan.nextInt();
			if(beg==0 || beg==1)
				beg=2;
			int end = scan.nextInt();
			int[] arr = new int[100000];
			int limit = (int)Math.floor(Math.sqrt(end)) + 1;
			for(int prime_index=0; prime_index<primes.size(); prime_index++){
				prime = primes.get(prime_index);
				if(prime>limit)
					break;
				int lowLim = (beg/prime)*prime;
				if(lowLim< beg)
					lowLim += prime;
				//System.out.println("prime is "+prime+"   "+lowLim);
				for(int j=lowLim; j<end+1; j= j+prime){
					//System.out.println("Setting "+j+" to 1");
					if(primes.contains(j))
						continue;
					arr[j-beg] = 1;
				}
			}
			for(int j=0;j<end-beg+1;j++){
				//System.out.println("j= "+j+"   "+arr[j]);
				if(arr[j]==0)
				    System.out.println(j+beg);
			}
		}
	}
}

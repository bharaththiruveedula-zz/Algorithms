import java.util.*;

class FASHION{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		while(count-->0){
			int len = scan.nextInt();
			int a[] = new int[len];
			int b[] = new int[len];
			for(int i=0;i<len;i++){
				a[i] = scan.nextInt();
			}
			for(int i=0;i<len;i++){
				b[i] = scan.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int sum = 0;
			for(int i=0;i<len;i++){
				sum += a[i]*b[i];
			}
			System.out.println(sum);

		}
	}
}
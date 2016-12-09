import java.util.*;
class CANDY{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int count = scan.nextInt();
			if(count==-1)
				return;
			int[] a =new int[count];
			int sum = 0;
			for(int i=0;i<count;i++){
				a[i] = scan.nextInt();	
				sum += a[i];
			}
			if(sum%count==0){
				int avg = sum/count;
				int times = 0;
				for(int i=0;i<count;i++){
					if(a[i]>avg){
						times = times+a[i]-avg;
						a[i] =a[i] - (a[i]-avg);
					}
				}
				System.out.println(times);
			}
			else{
				System.out.println("-1");
			}
		}
	}
}

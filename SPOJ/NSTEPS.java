import java.util.*;
class NSTEPS {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		while(count-->0){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a==b){
				if(a%2==0)
					System.out.println(a*2);
				else
					System.out.println(a*2-1);
			}
			else if(a-b==2){
				if(a%2==0)
				    System.out.println(a+b);
				else
					System.out.println(a+b-1);
			}
			else{
				System.out.println("No Number");
			}
		}
	}
}

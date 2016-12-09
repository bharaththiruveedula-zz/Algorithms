import java.util.*;
class ACPC10A{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a==b&&b==c&&c==a&&a==0)
			return;
		else if(b-a==c-b){
			System.out.println("AP "+(c+(c-b)));
		}
		else{
			System.out.println("GP "+c*(c/b));
		}
		}
	}

}

import java.util.*;
class HANGOVER {
	static int searchHangOver(float num, float[] hangs, int lb, int ub){
		int cur = (lb + ub)/2;
		float curValue = hangs[cur];
		float nexValue = hangs[cur+1];
		if(num >= curValue && num < nexValue)
			return cur+1;
		else if(num< curValue)
			return searchHangOver(num, hangs, lb, cur-1);
		else 
			return searchHangOver(num, hangs, cur+1, ub);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float hangs[] =  new float[277];
		hangs[0] = 0;
		float hang = 0;
		for(float i=1;i<277; i++){
			hang += 1/(i+1);
			hangs[(int)i] = hang;
		}
		while(true){
			float num = scan.nextFloat();
			if(num==0.00){
				break;
			}
			System.out.println(searchHangOver(num, hangs, 0, 276)+ " card(s)");
		}
	}

}

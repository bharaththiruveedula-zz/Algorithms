import java.util.*;
class TOANDFRO {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int count = scan.nextInt();
			if(count == 0)
				return;
			String s = scan.next();
			char[] ch = s.toCharArray();
			char[][] mo = new char[ch.length/count][count];
			int inc = 0;
			int j = 0;
			int k = 0;
			for(int i=0;i<ch.length; i++){
				mo[j][k++] = ch[i];
				//System.out.print(ch[i]);
				inc++;
				if(inc == count){
					j = j+2;
					i = i + count;
					k = 0;
					inc = 0;
					//System.out.println();
				}
			}
			j = 1;
			k = count-1;
			inc = 0;
			for(int i=count;i<ch.length; i++){
				mo[j][k--] = ch[i];
				//System.out.print(ch[i]);
				inc++;
				if(inc == count) {
					j = j + 2;
					i = i + count ;
					k = count - 1;
					inc = 0;
					//System.out.println();
				}
			}
			for(j=0; j<count; j++){
				for(int i=0; i<ch.length/count; i++){
					System.out.print(mo[i][j]);
				}
			}
			System.out.println();
		}
	}
}

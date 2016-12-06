import java.util.*;

class ONP {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		for(int count_index=0; count_index<count; count_index++){
			String exp = scan.next();
			Stack a = new Stack();
			Stack o = new Stack();
			char[] expArr = exp.toCharArray();
			for(int arr_i=0;arr_i<expArr.length;arr_i++){
				char c = expArr[arr_i];
				if(c=='(')
					continue;
			    else if(Character.isLetter(c))
			    	a.push(Character.toString(c));
				else if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){
					o.push(Character.toString(c));
				}
				else if(c==')'){
					String i = a.pop().toString();
					String j = a.pop().toString();
					String ch = o.pop().toString();
					a.push(j+i+ch);
				}
			}
			System.out.println(a.pop());
		}
	}
}

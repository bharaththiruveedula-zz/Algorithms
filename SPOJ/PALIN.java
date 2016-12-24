import java.util.*;

class PALIN {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count =  scan.nextInt();
		while(count -- > 0){
			char[] charArray = scan.next().toCharArray();
			int[] arr = new int[charArray.length];
			boolean allNine = true;
			for(int i=0;i<charArray.length; i++){
				arr[i] = Character.getNumericValue(charArray[i]);
				if(arr[i]!=9){
					allNine = false;
				}
			}
			if(allNine){
				for(int i=0;i<arr.length;i++){
					if(i==0)
						arr[i] = 10;
					else if(i==arr.length-1)
						arr[i] = 1;
					else
						arr[i] = 0;
				}
				if(arr.length==1)
					arr[0]=11;
                for(int i=0;i<arr.length;i++){
			        System.out.print(arr[i]);
		        }
		        System.out.println();
				continue;
			} else {
		        int i = arr.length/2;
		        int j = arr.length/2;
		        if(arr.length%2==0){
		        	i = i - 1;
				}
		        while(i>=0){
					if(arr[i]!=arr[j])
						break;
					i--;
					j++;
				}
				if(i<0){
					int temp = arr.length/2;
					if(arr.length%2==0)
						temp =  temp -1;
					int carry = 0;
					do{
						arr[temp] = arr[temp] +1;
						if(arr[temp]==10){
							arr[temp] = 0;
							carry = 1;
						}else{
							carry = 0;
						}
						if(temp==0 && carry==1)
							arr[temp] = 10;
						temp--;
					}while(temp>=0&&carry!=0);
					printMirror(arr);
					continue;
				}
				else {
					if(arr[i]>arr[j]){
						printMirror(arr);
						continue;
					}
					int temp = arr.length/2;
					if(arr.length%2==0)
						temp = temp - 1;
					int carry = 0;
					do{
						arr[temp] = arr[temp] + 1;
						if(arr[temp] == 10){
							arr[temp] = 0;
							carry = 1;
						} else {
							carry = 0;
						}
						if(temp==0 && carry == 1)
							arr[temp] = 10;
						temp--;
					}while(temp>=0&&carry!=0);
					printMirror(arr);
					continue;
				}
			}
		}
	}
	static void printMirror(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			arr[arr.length-1-i] = arr[i];
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}

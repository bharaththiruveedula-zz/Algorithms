import java.util.*;

public class STPAR {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true) {
            int count = scan.nextInt();
            if(count == 0){
            	break;
            }
	    int arr[] = new int[count];
	    int sortedArr[] = new int[count];
	    for(int i=0;i<count; i++) {
		arr[i] = scan.nextInt();
	        sortedArr[i] = arr[i];
	    }
	    Arrays.sort(sortedArr);
	    int j = 0;
            boolean valueSet = false;
	    Stack mainStack = new Stack();
	    Stack addStack = new Stack();
	    for(int i=0;i<count; i++){
                if(!mainStack.empty() && !addStack.empty()){
		    ListIterator it = addStack.listIterator(addStack.size());
		    int peek = (int)mainStack.peek();
                    int numPop = 0;
		    while(it.hasPrevious()){
			int cur = (int)it.previous();
			if(arr[i]>=cur && cur>=peek) {
                            //System.out.println("Pushed to main Stack:"+ cur);
                            //System.out.println("Popped from add stack:"+ cur);
			    mainStack.push(cur);
		            numPop++;
			}
			else 
			    break;
		    }
                    while(numPop-- > 0)
			addStack.pop();
		}
		if(arr[i]==sortedArr[j]){
                    //System.out.println("Pushed to main Stack:"+ arr[i]);
	            mainStack.push(arr[i]);
		    j++;
		}
		else{
	            if(!addStack.empty() && (int)addStack.peek()<arr[i]){
			valueSet = true;
			break;
		    }
                    //System.out.println("Pushed to add stack: "+ arr[i]);
		    addStack.push(arr[i]);
		}
	    }	    
            if(!valueSet&&isSorted(mainStack)){
		System.out.println("yes");
            }
            else{
	        System.out.println("no");
	    }
	
	}
    }
    static boolean isSorted(Stack mainStack){
    	ListIterator it = mainStack.listIterator(mainStack.size());
	int cur = (int)mainStack.peek();
	while(it.hasPrevious()){
	    int temp = (int)it.previous();
            if(cur<temp){
                //System.out.println("False because cur and temp are:" + cur +" " + temp);
		return false;
            }
	    else
		cur = temp;
	}
	return true;
    }
}

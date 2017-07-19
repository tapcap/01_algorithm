package sort;

public class QuickSort {
	
	public static void main(String[] args){
		int[] q0 = {9,8,7,3,9,9,0};
		int[] q1 = q0.clone();
		quicksort_1(q1,0,q1.length-1);
		for(int i : q1){
			//System.out.print(" " + i);
		}
	}
	
	//从小到大
	public static void quicksort_1(int[] q,int low,int high){
		int i = low , j = high;
		int key = q[i];
		while(i<j){
			
			while(i<j && q[j]>=key){
				j--;
			}
			if(i<j){
				q[i] = q[j];
			}
			
			while(i<j && q[i]<=key){
				i++;
			}
			if(i<j){
				q[j] = q[i];
			}
		}
		q[i] = key;
		
		
		if(true){
			//System.out.println(i+" "+j);
			for(int s : q){
				System.out.print(" " + s);
			}
			System.out.println();
		}
		
		if(i - 1 > low){
			quicksort_1(q,low,i-1);
		}
		if(i + 1< high){
			quicksort_1(q,i+1,high);
		}
		return;
	}

}

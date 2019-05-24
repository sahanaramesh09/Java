package sorting;

public class InsertionSort {
	
	public int[] insertionSort(int[] list) {
		int i,j,key,temp;
		for (i=1;i<list.length;i++) {
			key = list[i];
			j = i-1;
			while(j>=0 && key < list[j]) {
				temp = list[j];
				list[j] = list[j+1];
				list[j+1] = temp;
				j--;
			}
		}		
		return list;
	}
	
	void printArray(int[] list) {
		for(int i =0; i <list.length;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list1 = {5,4,3,10,6,7,1};
		InsertionSort a = new InsertionSort();

		System.out.println("Before Sorting:");
		a.printArray(list1);
		
		a.insertionSort(list1);
		
		System.out.println("After Sorting:");
		a.printArray(list1);	

	}

}

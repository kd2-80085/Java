/* 1. Write a generic static method to ﬁnd minimum from an array of "Number".
 * */

import java.util.Arrays;

public class FindMin {
	public static <T extends Number> T findMin(T arr[]) {
//		Arrays.sort(arr);//ascending sort 
		T min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].doubleValue()<min.doubleValue())
			{
				min=arr[i];
			}
		}
		return min;
	
	}
	
		
	

	public static void main(String[] args) {
		
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		System.out.println("Minimum from first array is "+min1);
		
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println("Minimum from first array is "+min2);

	}

}

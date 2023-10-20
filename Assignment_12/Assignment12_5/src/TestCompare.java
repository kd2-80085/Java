/*5. In above assignment, create one more array of Double (constant values) where 
 * few elements are repeated. 
 * Input a key from user and check how many
times key is repeated in the array using appropriate lambda expression*/

import java.util.Scanner;

public class TestCompare  {

	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int cnt=0;
		for(T ele: arr)
		{
			if(c.compare(ele, key))
				cnt++;	
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer [] arr = {44,77, 99, 22, 55, 66};
		Integer key = 50;
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Elements > key=50  Count= " + cnt);
		
		Double [] arr1= {50.2,50.6,50.2,60.5};
		for(Double element: arr1) {
			System.out.print(element+"	");
		}
  		Double key1;

  		System.out.println("\nEnter double value to check in above array: ");
  		key1=sc.nextDouble();
  		
		//int cnt2 = countIf(arr1, key1, (e,k)-> e-k==0);
		int cnt2 = countIf(arr1, key1, (e,k)-> e.equals(k));

		System.out.println("Count of repeated  key=50.2 elements  = " + cnt2);

}
}

import java.util.Comparator;
/* 2. A generic sort method for implementing selection sort algorithm is given below. In main(), create array of Double and sort it by calling selectionSort().
*/
class DComparator implements Comparator<Double> {
//	Double d1;
	@Override
	public int compare(Double d1, Double d2) {
		int diff =Double.compare(d1, d2);
		return diff;
	}
}
public class selectionSort {
	static <T> void selectionSort(T[] arr, Comparator<T> c)
	{
		for(int i=0; i<arr.length-1; i++) 
		{
			for(int j=i+1; j<arr.length; j++) 
			{
				if(c.compare(arr[i], arr[j]) > 0) 
					{
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}
			}
		}
	}

	public static void main(String[] args) {
		Double[] arr= {1.2,2.3,4.4,5.5,1.3};
		
		DComparator dcom=new DComparator();
		
		selectionSort(arr,dcom);
		
		for(Double ele:arr)
		System.out.println(ele);
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStringList {
	
	public static void main(String[] args) 
	{
		List<String>  strlist=new ArrayList<>();
//		strlist.add("Chaitanya");
//		strlist.add("Akshay");
//		strlist.add("Sameer");
//		strlist.add("Akshay");
		Collections.addAll(strlist,"Chaitanya","Akshay","Sameer","Akshay");
		class StringComparator implements Comparator<String>
		{

			@Override
			public int compare(String o1, String o2) {
				int diff=o1.length()-o2.length();
				return diff;
			}
			
		}
		StringComparator scmp =new StringComparator();
		System.out.println("Strings in the list are : ");
		System.out.println(strlist);
		System.out.print("String with maximum length is : ");
		
		System.out.println(Collections.max(strlist,scmp));
		


		
		
	}

}

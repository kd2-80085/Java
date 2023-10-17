/*3. Use Arrays.sort() to sort array of Students using Comparator. The 1st level sorting should be on city (desc), 2nd level sorting should be on marks (desc),
3rd level sorting should be on name (asc).*/

import java.util.Arrays;
import java.util.Comparator;

class CityMarksNameComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		int diff=-o1.getCity().compareTo(o2.getCity());
		if(diff==0)
			diff=-Double.compare(o1.getMarks(),o2.getMarks());
		if(diff==0)
			diff=o1.getName().compareTo(o2.getName());
		return diff;
	}
	
}

public class ComparatorTest 
{
public static void main(String[] args) {
	Student []arr= {new Student(1,"Chaitanya","Nashik",40),new Student(2,"Akash","Nashik",50),new Student(3,"Sahil","Mumbai",50)};
	
	CityMarksNameComparator comparator = new CityMarksNameComparator();
	Arrays.sort(arr, comparator);
	System.out.println("After Sort by Name, Sal: ");
	for (Student s : arr)		
		System.out.println(s);
}
	
}

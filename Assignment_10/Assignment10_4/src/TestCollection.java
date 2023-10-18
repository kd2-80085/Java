import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestCollection {

	public static void main(String[] args) {

		
		Collection<String> c = new ArrayList<>();//allow nulls,allow duplicates,in insertion order
		//Collection<String> c = new HashSet<>();//allow nulls but no duplicates and in sorted order
		//Collection<String> c = new LinkedHashSet<>();//null not allowed, no duplicates and in sorted order
		//Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");	
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
		
	}

}

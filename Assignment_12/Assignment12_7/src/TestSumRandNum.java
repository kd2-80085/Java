import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*Write a program to calculate sum of 10 random integers using streams.*/
public class TestSumRandNum {

	public static void main(String[] args) 
	{		
		Random r=new Random();
		
		Stream<Integer> strmRand10=Stream.generate(()->r.nextInt(10)).limit(10);
		List<Integer> list=strmRand10.collect(Collectors.toList());
		System.out.println(list);
		
		 Stream<Integer> stream2 = list.stream();
		 int result=stream2.reduce(0,(a,e)->a+e);//calculate sum
		 System.out.println("Sum of 10 Random No : "+result);
		
	}

}

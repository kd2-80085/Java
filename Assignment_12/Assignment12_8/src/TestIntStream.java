import java.util.stream.IntStream;

public class TestIntStream {

	public static void main(String[] args) 
	{

//Stream<Integer> wrapper type stream, IntStream primitive type stream
//		IntStream is faster than  Stream<Integer> wrapper
		IntStream strm1=IntStream.range(1,10);//1 to 9

		int total=strm1.sum();
		System.out.println(total);

		IntStream strm2=IntStream.range(1,10);//1 to 9
		System.out.println(strm2.summaryStatistics());

	}

}

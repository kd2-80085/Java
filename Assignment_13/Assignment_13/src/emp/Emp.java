package emp;
@FunctionalInterface
public interface Emp {
	
	static  double calcTotalIncome(Emp arr[])
	{
		double totalIncome=0.0;
		
		for(Emp e:arr) 
		{
			totalIncome+=e.getSal()+e.calcIncentives();
		}
		return totalIncome;
	}
	
	double getSal();//by deafult public abstract
	
	default double calcIncentives() //default method
	{
		return 0.0;
	}

}



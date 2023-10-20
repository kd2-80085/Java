package labor;

import emp.Emp;

public class Labor  implements Emp{
	
	double hours;
	double rate;
	
	@Override
	public double getSal() {
		return hours*rate;
	}
	@Override
	public double calcIncentives() {
		if(hours>300.0)
			return getSal()*0.05;
		else
			return 0.0;
	}
	public Labor(double hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}
	
	public Labor() {
	}

}

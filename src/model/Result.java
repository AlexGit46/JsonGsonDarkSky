package model;

public class Result {
	private Currently currently;
	private Daily daily;
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(Currently currently, Daily daily) {
		super();
		this.currently = currently;
		this.daily = daily;
	}
	public Currently getCurrently() {
		return currently;
	}
	public void setCurrently(Currently currently) {
		this.currently = currently;
	}
	public Daily getDaily() {
		return daily;
	}
	public void setDaily(Daily daily) {
		this.daily = daily;
	}
	@Override
	public String toString() {
		return "Result [currently=" + currently + ", daily=" + daily + "]";
	}
	

}

package model;

public class Currently {
	private String summary;
	private String icon;
	private Double precipProbability;
	private Double temperature;
	public Currently() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Currently(String summary, String icon, Double precipProbability, Double temperature) {
		super();
		this.summary = summary;
		this.icon = icon;
		this.precipProbability = precipProbability;
		this.temperature = temperature;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Double getPrecipProbability() {
		return precipProbability;
	}
	public void setPrecipProbability(Double precipProbability) {
		this.precipProbability = precipProbability;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Currently [summary=" + summary + ", icon=" + icon + ", precipProbability=" + precipProbability
				+ ", temperature=" + temperature + "]";
	}
	

}

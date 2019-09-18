package model;

public class Data {
	private long time;
	private String summary;
	private String icon;
	private Double precipProbability;
	private Double temperatureMin;
	private Double temperatureMax;
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Data(long time, String summary, String icon, Double precipProbability, Double temperatureMin,
			Double temperatureMax) {
		super();
		this.time = time;
		this.summary = summary;
		this.icon = icon;
		this.precipProbability = precipProbability;
		this.temperatureMin = temperatureMin;
		this.temperatureMax = temperatureMax;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
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
	public Double getTemperatureMin() {
		return temperatureMin;
	}
	public void setTemperatureMin(Double temperatureMin) {
		this.temperatureMin = temperatureMin;
	}
	public Double getTemperatureMax() {
		return temperatureMax;
	}
	public void setTemperatureMax(Double temperatureMax) {
		this.temperatureMax = temperatureMax;
	}
	@Override
	public String toString() {
		return "Data [time=" + time + ", summary=" + summary + ", icon=" + icon + ", precipProbability="
				+ precipProbability + ", temperatureMin=" + temperatureMin + ", temperatureMax=" + temperatureMax + "]";
	}
	

}

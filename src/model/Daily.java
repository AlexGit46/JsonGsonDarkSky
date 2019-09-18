package model;

import java.util.List;

public class Daily {
	private List<Data> data;

	public Daily() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Daily(List<Data> data) {
		super();
		this.data = data;
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Daily [data=" + data + "]";
	}
	

}

package io.javabrains.Train.model;

public class TrainModel {
    private String id;
	
	private String trainname;

	private String city;
	
	public TrainModel() {}

	public TrainModel(String id, String trainname, String city) {
		super();
		this.id = id;
		this.trainname = trainname;
		this.city = city;
	}
	
	public TrainModel(String trainname, String city) {
		
		this.trainname = trainname;
		this.city = city;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "TrainModel [id=" + id + ", trainname=" + trainname + ", city=" + city + "]";
	}

	

}

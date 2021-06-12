package io.javabrains.Train.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Train")
public class Train {
	@Id
	private String id;
	
	@Field
	private String trainname;
	
	@Field
	private String city;
	
	public Train() {}

	public Train(String id, String trainname, String city) {
		super();
		this.id = id;
		this.trainname = trainname;
		this.city = city;
	}
	
	public Train(String trainname, String city) {
		this.trainname = trainname;
		this.city = city;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String trainname() {
		return trainname;
	}
	public void trainname(String trainname) {
		this.trainname = trainname;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", trainname=" + trainname + ", city=" + city + "]";
	}
	

}

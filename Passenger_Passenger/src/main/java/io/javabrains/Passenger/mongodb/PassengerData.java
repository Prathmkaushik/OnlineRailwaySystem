package io.javabrains.Passenger.mongodb;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="PassengerData")
public class PassengerData {
	 private String id;
		
		private String name;
		private String email;
		private String Password;
		private String gender;
		private double age;
		private String Address;
		private String ContactNo;
		
		public PassengerData() {}

		
		public PassengerData(String id, String name, String email, String password, String gender, double age,
				String address, String contactNo) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			Password = password;
			this.gender = gender;
			this.age = age;
			Address = address;
			ContactNo = contactNo;
		}



		public PassengerData(String name, String email, String password, String gender, double age, String address,
				String contactNo) {
			this.name = name;
			this.email = email;
			Password = password;
			this.gender = gender;
			this.age = age;
			Address = address;
			ContactNo = contactNo;
		}


	
		
		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return Password;
		}


		public void setPassword(String password) {
			Password = password;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public double getAge() {
			return age;
		}


		public void setAge(double age) {
			this.age = age;
		}


		public String getAddress() {
			return Address;
		}


		public void setAddress(String address) {
			Address = address;
		}


		public String getContactNo() {
			return ContactNo;
		}


		public void setContactNo(String contactNo) {
			ContactNo = contactNo;
		}


		@Override
		public String toString() {
			return "PassengerModel [id=" + id + ",name=" + name + ", email=" + email + ",password" + Password + ",gender=" + gender + ", age=" + age + ",address=" + Address + ",contactno=" + ContactNo + "]";
		}


	
	
}

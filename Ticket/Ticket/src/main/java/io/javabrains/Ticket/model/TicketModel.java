package io.javabrains.Ticket.model;

public class TicketModel {
		
		private String id;
		private String dep_location;
		private String arrival_location;
		
		
		
		public TicketModel() {}


		public TicketModel(String id, String dep_location, String arrival_location) {
			super();
			this.id = id;
			this.dep_location = dep_location;
			this.arrival_location = arrival_location;
		}


		public TicketModel(String dep_location, String arrival_location) {
			super();
			this.dep_location = dep_location;
			this.arrival_location = arrival_location;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getDep_location() {
			return dep_location;
		}


		public void setDep_location(String dep_location) {
			this.dep_location = dep_location;
		}


		public String getArrival_location() {
			return arrival_location;
		}


		public void setArrival_location(String arrival_location) {
			this.arrival_location = arrival_location;
		}


		@Override
		public String toString() {
			return "TicketModel [id=" + id + ", dep_location=" + dep_location + ", arrival_location=" + arrival_location + "]";
		}
		
		
		
		
		

}

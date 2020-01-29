
public class Customer {
	  	private String name;
		private int priority;
		private int tour;
		
		public Customer(String name,int priority){
			this.name = name;
			this.setPriority(priority);
		}

		public int getPriority() {
			return priority;
		}

		public void setPriority(int priority) {
			this.priority = priority;
		}

		public int getTour() {
			return tour;
		}

		public void setTour(int tour) {
			this.tour = tour;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
}

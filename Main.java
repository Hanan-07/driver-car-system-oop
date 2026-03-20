package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Driver d1= new Driver ("Ali");
	      Car c1 = new Car("TR1234","Toyota Corolla",50.0,7.5);
	      Car c2 = new Car("TR5678","BMW X5",120.0,11.0);
	      Car c3 = new Car("TR9012","Kia Rio",80.0,6.5);
		  c1.displayInfo("TR1234","Toyota Corolla",50.0,7.5);
		  System.out.println();
		  c2.displayInfo("TR5678","BMW X5",120.0,11.0);
		  System.out.println();
		  c3.displayInfo("TR9012","Kia Rio",80.0,6.5);
		  System.out.println();
	      
	      
	      d1.drive(c1,2.3);
		  d1.drive(c2,2.3);
		  d1.drive(c3,2.3);
		  
		  
		  d1.displaySummary( d1.gettotalDistance(),d1.gettotalFuelUsed(),d1.gettotalFuelCost());
		
	}

}

package src;

public class Driver {
	private String name;
    private int numberofTrips;
	private double totalDistance;
	private double totalFuelUsed;
	private double totalFuelCost ;

	public Driver (String name) {

		this.name = name;
		numberofTrips=0;
		totalFuelUsed=0;
		totalFuelCost=0;}

public String getname()
{ return name;}
public int getnumberofTrips()
{ return numberofTrips;}
public double gettotalDistance()
{ return totalDistance;}
public double gettotalFuelUsed()
{ return totalFuelUsed;}
public double gettotalFuelCost()
{ return totalFuelCost;}

public void drive(Car car,double fuelPricePerLiter )
{   double fuelUsed = car.calculateFuelUsed(gettotalDistance(),gettotalFuelUsed());
   totalFuelUsed += fuelUsed;
   double fuelCost= fuelPricePerLiter*fuelUsed;
   totalFuelCost += fuelCost;
    totalDistance += car.gettripDistance();
    System.out.println("=== Driving Operations ===");
    System.out.println( name +" drove car "+ car.getmodel()+" ("+ car.getplateNumber()+") for "+ car.gettripDistance() +" km");
    System.out.println("Fuel Used: " + fuelUsed +" L");
    System.out.println("Trip fuel cost: "+ fuelCost);
	numberofTrips++;
	}
public void displaySummary(double totalDistance,double fuelUsed, double fuelCost) 
{ System.out.println("=== Driver Summary ===");
  System.out.println("Driver name: " + name);
  System.out.println("Number of Trips: " + numberofTrips);
  System.out.println("Total Distance: " + totalDistance +" km");
  System.out.println("Total Fuel used: " + totalFuelUsed+" L");
  System.out.println("Total Fuel cost: " + totalFuelCost);



}



}

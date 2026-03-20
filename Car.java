package src;
public class Car {
 private  String plateNumber;
 private  String model;
 private double tripDistance;
 private double fuelConsumptionPer100Km;
 
public Car(String plateNumber,String model,double tripDistance,double fuelConsumptionPer100Km) {

this.plateNumber=plateNumber;
this.model=model;
this.tripDistance= tripDistance;
this.fuelConsumptionPer100Km=fuelConsumptionPer100Km;
}


public String getplateNumber() {
	return plateNumber;}
public String getmodel() {
	return model;}
public double gettripDistance() {
	return tripDistance;}
public double getfuelConsumptionPer100Km() {
	return fuelConsumptionPer100Km;}
public double calculateFuelUsed(double tripDistance,double fuelConsumptionPer100Km) {
	double fuelUsed = (this.tripDistance * this.fuelConsumptionPer100Km)/100.0;
	return fuelUsed;}
public void displayInfo(String plateNumber,String model,double tripDistance,double fuelUsed) {                                                  
  System.out.println("=== Cars Information === " );
  System.out.println("Plate Number: " + plateNumber);
  System.out.println("Model: " + model);
  System.out.println("Trip Distance: " + tripDistance + "km");
  System.out.println("Fuel Consumption: " + fuelUsed + "L/100km");
}



}
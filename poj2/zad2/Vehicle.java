public class Vehicle {

   private int passengers;
   private double fuelcap;
   private double lkm;

   public Vehicle(int passengers, double fuelcap, double lkm) {
       this.passengers = passengers;
       this.fuelcap = fuelcap;
       this.lkm = lkm;
   }

   public Vehicle() {
   }

   public int getPassengers() {
       return passengers;
   }

   public void setPassengers(int passengers) {
       this.passengers = passengers;
   }

   public double getFuelcap() {
       return fuelcap;
   }

   public void setFuelcap(double fuelcap) {
       this.fuelcap = fuelcap;
   }

   public double getLkm() {
       return lkm;
   }

   public void setLkm(double lkm) {
       this.lkm = lkm;
   }
}
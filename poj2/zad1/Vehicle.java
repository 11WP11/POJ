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

   public int Passengers() {
       return passengers;
   }

   public void Passengers(int passengers) {
       this.passengers = passengers;
   }

   public double Fuelcap() {
       return fuelcap;
   }

   public void Fuelcap(double fuelcap) {
       this.fuelcap = fuelcap;
   }

   public double Lkm() {
       return lkm;
   }

   public void Lkm(double lkm) {
       this.lkm = lkm;
   }
}
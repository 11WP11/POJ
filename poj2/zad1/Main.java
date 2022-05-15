public class Main {

   public static void main(String[] args) {


        Vehicle miniVan = new Vehicle(4,50,7);
    
        int miniVanPassengers = miniVan.Passengers();
        double miniVanFuelcap = miniVan.Fuelcap();
        double miniVanLkm = miniVan.Lkm();

                Vehicle sportsCar = new Vehicle(2,70,17);
    
        int sportsCarPassengers = sportsCar.Passengers();
        double sportsCarFuelcap = sportsCar.Fuelcap();
        double sportsCarLkm = sportsCar.Lkm();
       
       
       
       

       
        System.out.println("Minivan przewozi "+miniVanPassengers+" osób na odległość do "+miniVanFuelcap/miniVanLkm*100+" kilometrów");
		System.out.println("Auto sportowe przewozi "+sportsCarPassengers+" osób na odległość do "+sportsCarFuelcap/sportsCarLkm*100+" kilometrów");
	
   }
}
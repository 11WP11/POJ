public class Main {

   public static void main(String[] args) {


        Vehicle miniVan = new Vehicle(4,50,7);
    
        int miniVanPassengers = miniVan.getPassengers();
        double miniVanFuelcap = miniVan.getFuelcap();
        double miniVanLkm = miniVan.getLkm();

                Vehicle sportsCar = new Vehicle(2,70,17);
    
        int sportsCarPassengers = sportsCar.getPassengers();
        double sportsCarFuelcap = sportsCar.getFuelcap();
        double sportsCarLkm = sportsCar.getLkm();
       
       
       
       

       
        System.out.println("Minivan przewozi " + miniVanPassengers +" osob na odległość do "+miniVanFuelcap/miniVanLkm*100 +" km");
        System.out.println("Auto sportowe przewozi " + sportsCarPassengers +" osob na odległość do "+sportsCarFuelcap/sportsCarLkm*100 +" km");

   }
}
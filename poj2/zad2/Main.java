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
       
       
       
       

       
        System.out.println("Minivan przewozi: " + miniVanPassengers +" osoby");
        System.out.println("Zasieg: "+ miniVanFuelcap/miniVanLkm*100 +" km" );
        System.out.println("Auto sportowe przewozi: " + sportsCarPassengers +" osoby");
        System.out.println("Zasieg: "+ sportsCarFuelcap/sportsCarLkm*100 +" km" ); 
   }
}
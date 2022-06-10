import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    
    String Pierwszy = (String)cars.get(0);
    String Ostatni = (String)cars.get(3);
 	
    cars.removeFirst();
    cars.removeLast();
    System.out.println("Pierwszy element listy: "+Pierwszy);
    System.out.println("Ostatni element listy: "+Ostatni);
    System.out.println(cars);

    
  }
}
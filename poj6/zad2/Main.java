import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    
    
    String tab[] = new String[cars.size()];
        
        cars.toArray(tab);
  
        for (String i : tab){
            System.out.println(i);
        }
  }
}
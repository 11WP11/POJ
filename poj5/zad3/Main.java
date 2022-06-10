import java.util.ArrayList;
import java.util.Iterator;



public class Main {
  public static void main(String[] args) {
    ArrayList<String> Coffee = new ArrayList<String>();
    Coffee.add("espresso");
    Coffee.add("latte");
    Coffee.add("cappuccino");
    Coffee.add("mocha");
    Coffee.add("auLait");
    Coffee.add("macchiato");
    
    System.out.println(Coffee);
    
    Iterator<String> it = Coffee.iterator();
    
    while(it.hasNext()) {
    System.out.println(it.next());
    }
    
    

    for (String i : Coffee) {
    System.out.println(i.toUpperCase());
    }
    
    
    for (int i = 0; i < 6; i++) {
    System.out.println(Coffee.get(i).substring(0, 4));
    }

    
  }
}
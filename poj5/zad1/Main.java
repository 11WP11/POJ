import java.util.ArrayList;


public class Main {



  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    int liczba = 0;
    for (int i = 0; i < 50; i++) {
      liczba = liczba + 2;
       myNumbers.add(liczba);
      
     System.out.print(i);
     System.out.print(".");
     System.out.println(myNumbers.get(i));
     
      

    }

   long stop = System.currentTimeMillis(); 
           long czas = stop - start;
           
        System.out.println("czas: " + czas +" ms");
  }

    }
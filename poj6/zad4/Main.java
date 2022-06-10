import java.util.*;

public class Main {
    public static void main(String[] args)
    {
    HashMap<Integer, String> miesiace = new HashMap<Integer, String>();
    
        miesiace.put(1, "styczeń");
    miesiace.put(2,	"luty");
    miesiace.put(3,	"marzec");
    miesiace.put(4,	"kwiecień");
    miesiace.put(5,	"maj");
    miesiace.put(6,	"czerwiec");
    miesiace.put(7,	"lipiec");
    miesiace.put(8,	"sierpień");
    miesiace.put(9,	"wrzesień");
    miesiace.put(10,	"październik");
    miesiace.put(11,	"listopad");
    miesiace.put(12,	"grudzień"); 
    
    
    

    System.out.println("wybierz 1-12");
    
    Scanner myObj = new Scanner(System.in);

    int liczba = myObj.nextInt();
    if(liczba>=1){
        
        if(liczba<=12){
        System.out.println("wybrałes " + liczba);
        }else{
        System.out.println("Bład");
    }
    }else{
        System.out.println("Bład");
    }
    
    

    
for (int i : miesiace.keySet()) {
      
      if(i==liczba){
          System.out.println(i +" - "+ miesiace.get(i));
      }

      

    }
      

    System.out.println(miesiace);
    
       
            
    }
}
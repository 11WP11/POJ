import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

            
        
        
        
        
        
        
        
        Pizza wegetariańska = new Pizza("Wegetariańska (szpinak, pomidor, sos, ser)", 0, "25 zł mała, 30 zł średnia, 35 zł duża");
    
        String wegetariańskaPizza = wegetariańska.getPizza();
        int wegetariańskaPoziom_ostrosci = wegetariańska.getPoziom_ostrosci();
        String wegetariańskaCena = wegetariańska.getCena();
                
                
        Pizza capriciosa  = new Pizza("Capriciosa  (pieczarki, szynka, sos, ser)", 1, "28 zł mała, 33 zł średnia, 38 zł duża");
    
        String capriciosaPizza = capriciosa.getPizza();
        int capriciosaPoziom_ostrosci = capriciosa.getPoziom_ostrosci();
        String capriciosaCena = capriciosa.getCena();
        
        
        Pizza pepperoni = new Pizza("Pepperoni (salami, papryka, sos, ser)", 2, "30 zł mała, 35 zł średnia, 40 zł duża");
    
        String pepperoniPizza = pepperoni.getPizza();
        int pepperoniPoziom_ostrosci = pepperoni.getPoziom_ostrosci();
        String pepperoniCena = pepperoni.getCena();
        
        
        
        System.out.println("Wybierz rodzaj pizzy\n");
        System.out.println("1. "+wegetariańskaPizza+" \nPoziom ostrosci: "+wegetariańskaPoziom_ostrosci+"\nCena: "+wegetariańskaCena+"\n");
        System.out.println("2. "+capriciosaPizza+" \nPoziom ostrosci: "+capriciosaPoziom_ostrosci+"\nCena: "+capriciosaCena+"\n");
        System.out.println("3. "+pepperoniPizza+" \nPoziom ostrosci: "+pepperoniPoziom_ostrosci+"\nCena: "+pepperoniCena+"\n");
        
        System.out.print("Wybierz: ");
        Scanner input = new Scanner(System.in);
        int rodzaj = input.nextInt();
        

        
        if (rodzaj == 1)
        {
          System.out.println("Wybrałes: ");
          System.out.println("1. "+wegetariańskaPizza+" \nPoziom ostrosci: "+wegetariańskaPoziom_ostrosci+"\nCena: "+wegetariańskaCena+"\n");
                          System.out.print("Ilość: ");
        Scanner inputt = new Scanner(System.in);
        int ilosc = inputt.nextInt();
                                          System.out.println("1. 25 zł mała \n2. 30 zł średnia \n3. 35 zł duża");
                                          System.out.print("Wybierz wielkosc: \n");
        Scanner inputtt = new Scanner(System.in);
        int wielkosc = inputtt.nextInt();
        
                                if(wielkosc == 1 )
                        {
                                System.out.println("Twoje zamowienie: ");
                                System.out.println("1. "+wegetariańskaPizza+" \nPoziom ostrosci: "+wegetariańskaPoziom_ostrosci+"\nCena: "+wegetariańskaCena+"\n");
                                System.out.println("Ilość: "+ilosc);
                                System.out.println("Wielkosc: mała");
                                int cena = 25*ilosc;
                                System.out.println("Cena: "+cena+" zł");
                                                                
                        }
                        else if(wielkosc == 2)
                        {
                            System.out.println("Twoje zamowienie: ");
                                System.out.println("1. "+wegetariańskaPizza+" \nPoziom ostrosci: "+wegetariańskaPoziom_ostrosci+"\nCena: "+wegetariańskaCena+"\n");
                                System.out.println("Ilość: "+ilosc);
                                System.out.println("Wielkosc: średnia");
                                int cena = 30*ilosc;
                                System.out.println("Cena: "+cena+" zł");
                        }
                        else if(wielkosc == 3)
                        {
                            System.out.println("Twoje zamowienie: ");
                                System.out.println("1. "+wegetariańskaPizza+" \nPoziom ostrosci: "+wegetariańskaPoziom_ostrosci+"\nCena: "+wegetariańskaCena+"\n");
                                System.out.println("Ilość: "+ilosc);
                                System.out.println("Wielkosc: duza");
                                int cena = 35*ilosc;
                                System.out.println("Cena: "+cena+" zł");
                        }
                        else
                        {
                          System.out.println("Bład");
                        }
        
        }
        
        
        
        
        
        
        
        
        
        
        else if(rodzaj == 2)
        {
            System.out.println("Wybrałes: ");
          System.out.println("2. "+capriciosaPizza+" \nPoziom ostrosci: "+capriciosaPoziom_ostrosci+"\nCena: "+capriciosaCena+"\n");
                                    System.out.print("Ilość: ");
        Scanner inputt = new Scanner(System.in);
        int ilosc = inputt.nextInt();
                                          System.out.println("1. 28 zł mała \n2. 33 zł średnia \n3. 38 zł duża");
                                          System.out.print("Wybierz wielkosc: ");
                                          
        Scanner inputtt = new Scanner(System.in);
        int wielkosc = inputtt.nextInt();
                        
                        
                        if(wielkosc == 1 )
                        {
                                System.out.println("Twoje zamowienie: ");
                                System.out.println("1. "+capriciosaPizza+" \nPoziom ostrosci: "+capriciosaPoziom_ostrosci+"\nCena: "+capriciosaCena+"\n");
                                System.out.println("Ilość: "+ilosc);
                                System.out.println("Wielkosc: mała");
                                int cena = 28*ilosc;
                                System.out.println("Cena: "+cena+" zł");
                                                                
                        }
                        else if(wielkosc == 2)
                        {
                            System.out.println("Twoje zamowienie: ");
                                System.out.println("1. "+capriciosaPizza+" \nPoziom ostrosci: "+capriciosaPoziom_ostrosci+"\nCena: "+capriciosaCena+"\n");
                                System.out.println("Ilość: "+ilosc);
                                System.out.println("Wielkosc: średnia");
                                int cena = 33*ilosc;
                                System.out.println("Cena: "+cena+" zł");
                        }
                        else if(wielkosc == 3)
                        {
                            System.out.println("Twoje zamowienie: ");
                                System.out.println("1. "+capriciosaPizza+" \nPoziom ostrosci: "+capriciosaPoziom_ostrosci+"\nCena: "+capriciosaCena+"\n");
                                System.out.println("Ilość: "+ilosc);
                                System.out.println("Wielkosc: duza");
                                int cena = 38*ilosc;
                                System.out.println("Cena: "+cena+" zł");
                        }
                        else
                        {
                          System.out.println("Bład");
                        }

        
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        else if(rodzaj == 3)
        {
            System.out.println("Wybrałes: ");
           System.out.println("3. "+pepperoniPizza+" \nPoziom ostrosci: "+pepperoniPoziom_ostrosci+"\nCena: "+pepperoniCena+"\n");
                                     System.out.print("Ilość: ");
        Scanner inputt = new Scanner(System.in);
        int ilosc = inputt.nextInt();
                                          System.out.println("1. 30 zł mała \n2. 35 zł średnia \n3. 40 zł duża");
                                          System.out.print("Wybierz wielkosc: ");
        Scanner inputtt = new Scanner(System.in);
        int wielkosc = inputtt.nextInt();
        
            if(wielkosc == 1 )
                        {
                                System.out.println("Twoje zamowienie: ");
                                System.out.println("1. "+pepperoniPizza+" \nPoziom ostrosci: "+pepperoniPoziom_ostrosci+"\nCena: "+pepperoniCena+"\n");
                                System.out.println("Ilość: "+ilosc);
                                System.out.println("Wielkosc: mała");
                                int cena = 30*ilosc;
                                System.out.println("Cena: "+cena+" zł");
                                                                
                        }
                        else if(wielkosc == 2)
                        {
                            System.out.println("Twoje zamowienie: ");
                                System.out.println("1. "+pepperoniPizza+" \nPoziom ostrosci: "+pepperoniPoziom_ostrosci+"\nCena: "+pepperoniCena+"\n");
                                System.out.println("Ilość: "+ilosc);
                                System.out.println("Wielkosc: średnia");
                                int cena = 35*ilosc;
                                System.out.println("Cena: "+cena+" zł");
                        }
                        else if(wielkosc == 3)
                        {
                            System.out.println("Twoje zamowienie: ");
                                System.out.println("1. "+pepperoniPizza+" \nPoziom ostrosci: "+pepperoniPoziom_ostrosci+"\nCena: "+pepperoniCena+"\n");
                                System.out.println("Ilość: "+ilosc);
                                System.out.println("Wielkosc: duza");
                                int cena = 40*ilosc;
                                System.out.println("Cena: "+cena+" zł");
                        }
                        else
                        {
                          System.out.println("Bład");
                        }
            
            
        }
         else
        {
            System.out.println("Bład");
        }
                
                
                
                
                
                System.out.println("1. Dostawa 7 zł");
                System.out.println("2. Odbiór osobisty");
                System.out.print("Wybierz: ");
        Scanner inputd = new Scanner(System.in);
        int dostwa = inputd.nextInt();
        
            if(dostwa == 1)
            {
                System.out.print("Podaj adres: ");
                Scanner inputdd = new Scanner(System.in);
       String adres = inputdd.nextLine();
        System.out.println("Adres dostawy: "+adres);
        System.out.println("Koszt dostawy 7 zł");
        System.out.println("Czas oczekiwania 50 minut");
        System.out.println("W przypadku pytan prosze dzwonic: 777-777-777");
            }
            else if( dostwa == 2)
            {
                System.out.println("Wybrałes odbior osobisty");
                System.out.println("Czas oczekiwania 40 minut");
                System.out.println("W przypadku pytan prosze dzwonic: 777-777-777");
            }
            else
            {
               System.out.print("Bład"); 
            }
        
       

   }
}
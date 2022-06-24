public class Pizza {

   private String pizza;
   private int poziom_ostrosci;
   private String cena;

   public Pizza(String pizza, int poziom_ostrosci, String cena) {
       this.pizza = pizza;
       this.poziom_ostrosci = poziom_ostrosci;
       this.cena = cena;
   }

   public Pizza() {
   }

   public String getPizza() {
       return pizza;
   }

   public void setPizza(String pizza) {
       this.pizza = pizza;
   }

   public int getPoziom_ostrosci() {
       return poziom_ostrosci;
   }

   public void setPoziom_ostrosci(int poziom_ostrosci) {
       this.poziom_ostrosci = poziom_ostrosci;
   }
   
   public String getCena() {
       return cena;
   }

   public void setCena(String cena) {
       this.cena = cena;
   }
}
public class Main {

   public static void main(String[] args) {

       Author autor = new Author("Bolesław", "Prus", 55);
        Author autorr = new Author("Jan", "Brzechwa", 60);
        Author autorrr = new Author("Julian", "Tuwim", 50);
       String autorName = autor.getName();
       String autorSurname = autor.getSurname();
       int autorAge = autor.getAge();
       
       String autorrName = autorr.getName();
       String autorrSurname = autorr.getSurname();
       int autorrAge = autorr.getAge();
       
       String autorrrName = autorrr.getName();
       String autorrrSurname = autorrr.getSurname();
       int autorrrAge = autorrr.getAge();

            System.out.println( autorName.toString() +" "+ autorSurname.toString()+" "+autorAge);
            System.out.println( autorrName.toString() +" "+ autorrSurname.toString()+" "+autorrAge);
            System.out.println( autorrrName.toString() +" "+ autorrrSurname.toString()+" "+autorrrAge);
   }

}

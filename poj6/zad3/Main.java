import java.util.*;

public class Main {
    public static void main(String[] args)
    {


        TreeSet<String> tree1 = new TreeSet<>();
  

        tree1.add("biały");
        tree1.add("czarny");
        tree1.add("niebieski");
        tree1.add("czerwony");
        tree1.add("zielony");
  
  

        System.out.println(tree1);
        
        
        for (String i : tree1){
            System.out.println(i);
        }
        
        
                
                
                
                
                
                TreeSet<String> tree2 = new TreeSet<>();
  

        tree2.add("żółty");
        tree2.add("fioletowy");
        tree2.add("szary");

  
  

        System.out.println(tree2);
        
        for (String i : tree2){
            tree1.add(i);
        }
        System.out.println(tree1);
        NavigableSet<String>
        tree1od = tree1.descendingSet();
        System.out.println(tree1od);
        
        
        System.out.println("First: " + tree1.first());
        System.out.println("Last: " + tree1.last());
        
        
        TreeSet tree3 = new TreeSet();
        tree3 = (TreeSet)tree1.clone();
        System.out.println("klon: " + tree3);
        
        
        System.out.println("Size: " + tree1.size());
            
    }
}
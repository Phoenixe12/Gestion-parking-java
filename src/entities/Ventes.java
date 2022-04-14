package entities;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;
public class Ventes{
   private Client client;
   private List<Produit> produits= new ArrayList<Produit>();
   private Date date;
   public static int counter=1;
   public Ventes(Client c,Produit p){
      client=c;
      produits.add(p);
      date=new Date();
   }
}
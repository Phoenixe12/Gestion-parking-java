package entities;
import java.util.Date;
public class Produit {
   private int code;
   private String libelle;
   private double prix;
   private int stock;
   private Date date_expire;
   public static int counter=1;
   public Produit(String libelle,double prix,int stock,Date d){
      this.libelle=libelle;
      this.prix=prix;
      this.stock=stock;
      date_expire=d;
      code=counter;
      counter++;
   }
   public String getLibelle(){ return libelle; }
   public double getPrix(){ return prix; }
   public int getStock(){ return stock; }
   public int getCode(){ return code; }
   public void setLibelle(String s){ libelle=s; }
   public void setPrix(double s){ prix=s; }
   public void setStock(int s){ stock=s; }
   public String toString(){
      return "\n==================== PRODUIT No. "+code+" =========================\n"+
      ">>> Code: "+code+"\n"+">>> Libelle: "+libelle+"\n>>> Prix: "+prix+"\n>>> Stock: "+stock+"\n>>> Exipration: "+date_expire
      +"\n----------------------------------------------------------------";
   }
}
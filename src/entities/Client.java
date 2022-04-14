package entities;
import java.util.Date;
public class Client {
   private int identifiant;
   private String nom;
   private String prenom;
   private String telephone;
   private String adresse;
   private Date date;
   public static int counter=1;
   public Client(String nom,String prenom,String tel,String adresse){
      this.nom=nom;
      this.prenom=prenom;
      telephone=tel;
      this.adresse=adresse;
      identifiant=counter;
      date=new Date();
      counter++;
   }
   public String getNom(){ return nom; }
   public String getPreom(){ return prenom; }
   public String getTelephone(){ return telephone; }
   public String getAdresse(){ return adresse; }
   public int getIdentifiant(){ return identifiant; }
   public void setNom(String s){ nom=s; }
   public void setPreom(String s){ prenom=s; }
   public void setTelephone(String s){ telephone=s; }
   public void setAdresse(String s){ adresse=s; }
   public String toString(){
      return "\n==================== CLIENT No. "+identifiant+" =========================\n"+
      ">>> Identifiant: "+identifiant+"\n"+">>> Nom: "+nom+"\n>>> Prenom: "+prenom+"\n>>> Telephone: "+telephone+"\n>>> Adresse: "+adresse
      +"\n-----------------------------------------------------------";
   }
}

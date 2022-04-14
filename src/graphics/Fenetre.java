package graphics;
import java.awt.*;
import javax.swing.*;
public class Fenetre extends JFrame {
   private static final int widthVP=Toolkit.getDefaultToolkit().getScreenSize().width; // width de l'ecran
   private static final int heightVP=Toolkit.getDefaultToolkit().getScreenSize().height; // height de l'ecran
   public static final Color COLOR=new Color(233,30,99);
   public static int WIDTH=widthVP-widthVP/3;
   public static int HEIGHT=heightVP-heightVP/3;
   public static final int headerWidth=350;
   public static final Color headerBG=new Color(52,52,52);
   public static final Color headerItemActive=new Color(36,36,36);
   public static final Color headerItemHover=new Color(50,50,50);
   public Fenetre(String s){
      setTitle(s); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      if(WIDTH<900){
         WIDTH=900;
         HEIGHT=508;
      }
      setBounds((widthVP-WIDTH)/2,(heightVP-HEIGHT)/2,WIDTH,HEIGHT);
   }
}

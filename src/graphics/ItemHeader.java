package graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import graphics.Fenetre;

import javax.swing.*;
public class ItemHeader extends JLabel{
   private Color bg;
   public ItemHeader(String s){
      setText(s);
      setOpaque(true);
      setCursor(new Cursor(Cursor.HAND_CURSOR));
      setFont(new Font("Arial",Font.PLAIN,16)); //insertar fuento (PLAIN, BOLD, ITALIC)
      setForeground(new Color(150,150,150));
      setBorder(new EmptyBorder(18,25,18,25));
      setBackground(Fenetre.headerBG); //color de fondo
      setFocusable(true);
      setPreferredSize(new Dimension(Fenetre.headerWidth,50));
      addMouseListener(new MouseAdapter(){
         public void mouseEntered(MouseEvent e){
            bg=getBackground();
            if(!getBackground().equals(Fenetre.headerItemActive)){
               setBackground(Fenetre.headerItemHover);
            }
         }
         public void mouseExited(MouseEvent e){
            setBackground(bg);
         }
      });
   }
   public Color getBg(){
      return bg;
   }
   public void setBg(Color b){
      bg=b;
   }
}

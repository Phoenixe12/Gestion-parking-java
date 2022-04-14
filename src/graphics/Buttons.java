package graphics;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class Buttons extends JButton {
   public Buttons(String s){
      setText(s);
      // setBackground(new Color(96, 230, 197));
      // setForeground(new Color(251,251,251));
      setBackground(new Color(245, 248, 249));
      setForeground(new Color(86, 91, 95));
      setFont(new Font("Arial",Font.PLAIN,12));
      setPreferredSize(new Dimension(120,43));
      setBorder(new EmptyBorder(0,0,0,0));
      setCursor(new Cursor(Cursor.HAND_CURSOR));
      setFocusPainted(false);
   }
}
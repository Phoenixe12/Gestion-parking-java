package graphics;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
public class TableItem extends JPanel{
   private static int level=1;
   public TableItem(int cols,String [] vals){
      setLayout(new GridLayout(1,cols,0,0));
      setPreferredSize(new Dimension(700,40));
      setForeground(new Color(56, 56, 56));
      if(level%2==1){
         setBorder(BorderFactory.createMatteBorder(1,1,1,1,new Color(237,237,237)));
         setBackground(new Color(239, 239, 239));
      }else{
         setBackground(new Color(255, 255, 255));
      }
      JLabel elem;
      for(int i=0;i<vals.length;i++){
          elem=new JLabel(vals[i]);
          elem.setFont(new Font("Arial",Font.PLAIN,14));
          elem.setBorder(new EmptyBorder(8,8,8,8));
          add(elem);
      }
      level++;
   }
}
package miniprojet;
import graphics.*;
import entities.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
public class MiniProjet{
   private static JPanel mainContent;
   private static String panelActive="add_produit";
   public static void main(String ...args){
      Fenetre window=new Fenetre("Gestion d_une boutique");
      JPanel container=new JPanel(new BorderLayout());
      

      /* ONGLET: INSERT CLIENT */
      JPanel vue_AddClient=new JPanel();
      vue_AddClient.setOpaque(false);
      vue_AddClient.setPreferredSize(new Dimension(500,Fenetre.HEIGHT));
      vue_AddClient.setBorder(new EmptyBorder(10,0,10,0));
      JPanel wrap_AddClient=new JPanel();
      wrap_AddClient.setOpaque(false);
      wrap_AddClient.setPreferredSize(new Dimension(500,Fenetre.HEIGHT-10));
      JLabel salue_AddClient=new JLabel("Bienvenue");
      salue_AddClient.setFont(new Font("Arial",Font.BOLD,40));
      salue_AddClient.setPreferredSize(new Dimension(500,60));
      salue_AddClient.setForeground(Fenetre.COLOR);
      wrap_AddClient.add(salue_AddClient);
      JLabel img_center_AddClient=new JLabel();
      img_center_AddClient.setOpaque(false);
      img_center_AddClient.setIcon(new ImageIcon("assets/img.png"));
      JLabel text_new_AddClient=new JLabel("CREER UN CLEINT");
      text_new_AddClient.setFont(new Font("Arial",Font.BOLD,14));
      text_new_AddClient.setPreferredSize(new Dimension(500,30));
      text_new_AddClient.setForeground(new Color(185,185,185));
      wrap_AddClient.add(img_center_AddClient);
      wrap_AddClient.add(text_new_AddClient);
      JPanel form_AddClient=new JPanel(new GridLayout(3,2,10,13));
      form_AddClient.setOpaque(false);
      Champ nom_AddClient=new Champ("Nom");
      Champ prenom_AddClient=new Champ("Prenom");
      Champ phone_AddClient=new Champ("+229  |  Telephone");
      Champ addresse_AddClient=new Champ("Addresse");
      JLabel show_all_AddClient=new JLabel("Voir toues les clients");
      show_all_AddClient.setCursor(new Cursor(Cursor.HAND_CURSOR));
      show_all_AddClient.setFocusable(true);
      show_all_AddClient.setIcon(new ImageIcon("assets/table.png"));
      form_AddClient.add(nom_AddClient);
      form_AddClient.add(prenom_AddClient);
      form_AddClient.add(phone_AddClient);
      form_AddClient.add(addresse_AddClient);
      form_AddClient.add(show_all_AddClient);
      wrap_AddClient.add(form_AddClient);
      vue_AddClient.add(wrap_AddClient);




      /* ONGLET: INSERT PRODUCTS */
      JPanel vue_AddProduit=new JPanel();
      vue_AddProduit.setOpaque(false);
      vue_AddProduit.setPreferredSize(new Dimension(500,Fenetre.HEIGHT));
      vue_AddProduit.setBorder(new EmptyBorder(10,0,10,0));
      JPanel wrap_AddProduit=new JPanel();
      wrap_AddProduit.setOpaque(false);
      wrap_AddProduit.setPreferredSize(new Dimension(500,Fenetre.HEIGHT-10));
      JLabel salue_AddProduit=new JLabel("Bienvenue");
      salue_AddProduit.setFont(new Font("Arial",Font.BOLD,40));
      salue_AddProduit.setPreferredSize(new Dimension(500,60));
      salue_AddProduit.setForeground(Fenetre.COLOR);
      wrap_AddProduit.add(salue_AddProduit);
      JLabel img_center_AddProduit=new JLabel();
      img_center_AddProduit.setOpaque(false);
      img_center_AddProduit.setIcon(new ImageIcon("assets/img.png"));
      JLabel text_new_AddProduit=new JLabel("AJOUTER UN PRODUIT");
      text_new_AddProduit.setFont(new Font("Arial",Font.BOLD,14));
      text_new_AddProduit.setPreferredSize(new Dimension(500,30));
      text_new_AddProduit.setForeground(new Color(185,185,185));
      wrap_AddProduit.add(img_center_AddProduit);
      wrap_AddProduit.add(text_new_AddProduit);
      JPanel form_AddProduit=new JPanel(new GridLayout(3,2,10,13));
      form_AddProduit.setOpaque(false);
      Champ libelle_AddProduit=new Champ("Libelle");
      Champ prix_AddProduit=new Champ("XOF  | Prix");
      Champ stock_AddProduit=new Champ("Qte Stock");
      Champ date_AddProduit=new Champ("Date exp. 01/12/2021");
      JLabel show_all_AddProduit=new JLabel("Voir toues les clients");
      show_all_AddProduit.setCursor(new Cursor(Cursor.HAND_CURSOR));
      show_all_AddProduit.setFocusable(true);
      show_all_AddProduit.setIcon(new ImageIcon("assets/table.png"));
      form_AddProduit.add(libelle_AddProduit);
      form_AddProduit.add(prix_AddProduit);
      form_AddProduit.add(stock_AddProduit);
      form_AddProduit.add(date_AddProduit);
      form_AddProduit.add(show_all_AddProduit);
      wrap_AddProduit.add(form_AddProduit);
      vue_AddProduit.add(wrap_AddProduit);



      /* ONGLET: INSERT VENTES */
      JPanel vue_AddVente=new JPanel();
      vue_AddVente.setOpaque(false);
      vue_AddVente.setPreferredSize(new Dimension(500,Fenetre.HEIGHT));
      vue_AddVente.setBorder(new EmptyBorder(10,0,10,0));
      JPanel wrap_AddVente=new JPanel();
      wrap_AddVente.setOpaque(false);
      wrap_AddVente.setPreferredSize(new Dimension(500,Fenetre.HEIGHT-10));
      JLabel salue_AddVente=new JLabel("Bienvenue");
      salue_AddVente.setFont(new Font("Arial",Font.BOLD,40));
      salue_AddVente.setPreferredSize(new Dimension(500,60));
      salue_AddVente.setForeground(Fenetre.COLOR);
      wrap_AddVente.add(salue_AddVente);
      JLabel img_center_AddVente=new JLabel();
      img_center_AddVente.setOpaque(false);
      img_center_AddVente.setIcon(new ImageIcon("assets/img.png"));
      JLabel text_new_AddVente=new JLabel("INSERER UNE VENTE");
      text_new_AddVente.setFont(new Font("Arial",Font.BOLD,14));
      text_new_AddVente.setPreferredSize(new Dimension(500,30));
      text_new_AddVente.setForeground(new Color(185,185,185));
      wrap_AddVente.add(img_center_AddVente);
      wrap_AddVente.add(text_new_AddVente);
      JPanel form_AddVente=new JPanel(new GridLayout(3,2,10,13));
      form_AddVente.setOpaque(false);
      Champ code_AddVente=new Champ("Code Produit");
      Champ client_AddVente=new Champ("Code Client");
      Champ unite_AddVente=new Champ("Unites");
      Champ date_AddVente=new Champ("Date. 01/12/2021");
      JLabel show_all_AddVente=new JLabel("Voir toues les clients");
      show_all_AddVente.setCursor(new Cursor(Cursor.HAND_CURSOR));
      show_all_AddVente.setFocusable(true);
      show_all_AddVente.setIcon(new ImageIcon("assets/table.png"));
      form_AddVente.add(code_AddVente);
      form_AddVente.add(client_AddVente);
      form_AddVente.add(unite_AddVente);
      form_AddVente.add(date_AddVente);
      form_AddVente.add(show_all_AddVente);
      wrap_AddVente.add(form_AddVente);
      vue_AddVente.add(wrap_AddVente);
      
      
      
      /* ============ ONGLET: LES MEILLEURS CLIENTS ========== */
        JPanel vue_AllClientes=new JPanel();
        vue_AllClientes.setOpaque(false);
        vue_AllClientes.setLayout(new BorderLayout());
        JPanel wrapText=new JPanel();
        wrapText.setBorder(new EmptyBorder(8,0,8,0));
        JLabel text=new JLabel("INFORMATION DES CLIENTS");
        text.setFont(new Font("Arial",Font.PLAIN,25));
        wrapText.add(text);
        wrapText.setOpaque(false);

        JPanel content=new JPanel();
        content.setOpaque(false);
        JPanel wrap=new JPanel();
        wrap.setOpaque(false);
        String [] a={"CLT001","GODONOU","Armel","+229 65 87 98 56","Porto Novo"};
        wrap.add(new TableItem(5,a));
        content.add(wrap);
        vue_AllClientes.add(wrapText,BorderLayout.NORTH);
        vue_AllClientes.add(content,BorderLayout.CENTER);
        
        
        
        
        /* FOOTER */
      JPanel footBottom=new JPanel();
      footBottom.setPreferredSize(new Dimension(Fenetre.WIDTH-Fenetre.headerWidth,80));
      footBottom.setBackground(new Color(245,245,245));
      JPanel wrapBtns=new JPanel(new GridLayout(1,2,12,0));
      footBottom.setBorder(new EmptyBorder(15,0,0,0));
      wrapBtns.setOpaque(false);
      wrapBtns.setPreferredSize(new Dimension(340,43));
      Buttons cancel=new Buttons("CANCEL");
      Buttons send=new Buttons("SAUVER");
      cancel.setBackground(new Color(229, 229, 229));
      // cancel.setForeground(new Color(86, 91, 95));
      send.setBackground(Fenetre.COLOR);
      send.setForeground(Color.WHITE);
      send.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
             // TODO Auto-generated method stub
             if(panelActive.equalsIgnoreCase("add_client")){
               if(!nom_AddClient.getText().trim().equals("") && !prenom_AddClient.getText().trim().equals("") && !phone_AddClient.getText().trim().equals("") && !addresse_AddClient.getText().trim().equals("")){
                  Client clt=new Client(nom_AddClient.getText(),prenom_AddClient.getText(),phone_AddClient.getText(),addresse_AddClient.getText());
                  System.out.println(clt.toString());
               }
             }else if(panelActive.equalsIgnoreCase("add_produit")){
               if(!libelle_AddProduit.getText().trim().equals("") && !prix_AddProduit.getText().trim().equals("") && !stock_AddProduit.getText().trim().equals("") && !date_AddProduit.getText().trim().equals("")){
                  Produit clt=new Produit(libelle_AddProduit.getText(),Double.parseDouble(prix_AddProduit.getText()),Integer.parseInt(stock_AddProduit.getText()),new Date(2023,5,17));
                  System.out.println(clt.toString());
               }
            }else if(panelActive.equalsIgnoreCase("add_vente")){
                if(!code_AddVente.getText().trim().equals("") && !client_AddVente.getText().trim().equals("") && !unite_AddVente.getText().trim().equals("") && !date_AddVente.getText().trim().equals("")){
                  Produit clt=new Produit(code_AddVente.getText(),Double.parseDouble(client_AddVente.getText()),Integer.parseInt(unite_AddVente.getText()),new Date(2023,5,17));
                  System.out.println(clt.toString());
               }
            }
             
         }
      });
      footBottom.add(wrapBtns);
      wrapBtns.add(cancel);
      wrapBtns.add(send);
      





      /* HEADER */
      JPanel header=new JPanel();
      header.setPreferredSize(new Dimension(Fenetre.headerWidth,Fenetre.HEIGHT));
      header.setBackground(Fenetre.headerBG);
      JPanel logo=new JPanel(new FlowLayout(FlowLayout.LEFT));
      logo.setOpaque(false);
      logo.setBorder(new EmptyBorder(20,12,20,12));
      logo.setPreferredSize(new Dimension(Fenetre.headerWidth,60));
      JLabel text1=new JLabel("Geny");
      text1.setForeground(new Color(255,255,255));
      text1.setFont(new Font("Arial",Font.BOLD,30));
      JLabel text2=new JLabel("Martket");
      text2.setForeground(new Color(225,225,225));
      text2.setFont(new Font("Arial",Font.PLAIN,30));
      logo.add(text1);
      logo.add(text2);
      ItemHeader item_products=new ItemHeader("Produits");
      item_products.setBackground(Fenetre.headerItemActive);
      item_products.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent e){
            removeItemsActives(header);
            item_products.setBg(Fenetre.headerItemActive);
            item_products.setBackground(Fenetre.headerItemActive);
            panelActive="add_produit";
            changePanel(vue_AddProduit);
            footBottom.setVisible(true);
         }
      });
      ItemHeader item_clients=new ItemHeader("Clients");
      item_clients.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent e){
            removeItemsActives(header);
            item_clients.setBg(Fenetre.headerItemActive);
            item_clients.setBackground(Fenetre.headerItemActive);
            panelActive="add_client";
            changePanel(vue_AddClient);
            footBottom.setVisible(true);
         }
      });
      ItemHeader item_orders=new ItemHeader("Ventes");
      item_orders.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent e){
            removeItemsActives(header);
            item_orders.setBg(Fenetre.headerItemActive);
            item_orders.setBackground(Fenetre.headerItemActive);
            panelActive="add_vente";
            changePanel(vue_AddVente);
            footBottom.setVisible(true);
         }
      });
      ItemHeader item_bestClients=new ItemHeader("Meilleurs Clients");
      item_bestClients.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent e){
            removeItemsActives(header);
            item_bestClients.setBg(Fenetre.headerItemActive);
            item_bestClients.setBackground(Fenetre.headerItemActive);
            panelActive="best_clients";
            changePanel(vue_AllClientes);
            footBottom.setVisible(false);
         }
      });
      header.add(logo);
      header.add(item_products);header.add(item_clients);header.add(item_orders);header.add(item_bestClients);
      container.add(header,BorderLayout.WEST);
      JPanel body=new JPanel(new BorderLayout());
      body.setBackground(Color.WHITE);


      



      /* INSERTTIONS DE LA PAGE */
      mainContent=new JPanel();
      mainContent.setOpaque(false);
      body.add(mainContent,BorderLayout.CENTER);
      mainContent.add(vue_AddProduit);
      body.add(footBottom,BorderLayout.SOUTH);
      container.add(body,BorderLayout.CENTER);
      window.add(container);

      window.setVisible(true);
   }
   public static void changePanel(JPanel c){
      mainContent.removeAll();
      mainContent.add(c);
      mainContent.repaint();
      mainContent.revalidate();
    }
    public static List<Component> getAllComponents(final Container c) {
      Component[] comps = c.getComponents();
      List<Component> compList = new ArrayList<Component>();
      for (Component comp : comps) {
         compList.add(comp);
         if (comp instanceof Container)
               compList.addAll(getAllComponents((Container) comp));
      }
      return compList;
   }
   public static void removeItemsActives(JPanel header){
      List<ItemHeader> champs=new ArrayList<ItemHeader>();
            List<Component> comps=getAllComponents(header);
            for(Component c: comps){
               if(c.getClass().equals(ItemHeader.class)){
                  champs.add((ItemHeader)c);
               }
            }
            for(ItemHeader c: champs){
                  if(c.getText().equalsIgnoreCase("Produits") || c.getText().equalsIgnoreCase("Clients") || c.getText().equalsIgnoreCase("Ventes") || c.getText().equalsIgnoreCase("Meilleurs Clients")){
                     c.setBackground(Fenetre.headerBG);
                  }
            }
   }
}
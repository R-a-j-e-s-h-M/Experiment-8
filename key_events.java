
  import java.awt.event.*;
  import javax.swing.*;  
  public class key_events extends KeyAdapter{  
      static JLabel l; 
      public void keyPressed(KeyEvent e) {  
          l.setText("User pressed a key");  
      }  
      public void keyReleased(KeyEvent e) {  
          l.setText("User released the Key");  
      }  
      public void keyTyped(KeyEvent e) {  
          l.setText("Typing");  
      }  
      public static void main(String[] args) {  
          JFrame f = new JFrame("Key");
          f.setSize(300,300);  
          key_events k = new key_events();
          f.addKeyListener(k);
          JPanel p = new JPanel();
          l = new JLabel();
          p.add(l);
          f.add(p);
          f.setVisible(true); 
      }  
  }  
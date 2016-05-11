

   import java.awt.Dimension;
import javax.swing.*;

   public class Calculator extends JFrame{
      private JButton equals, add, minus, multiply, divide;
      private JFrame f;
      private JPanel p;
      public static void main(String[] args){
         new Calculator();
      }
   
      public Calculator(){
          f= new JFrame("Calculator");
      
         f.setSize(800,800);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      	
         p = new JPanel();
  
      
         equals = new JButton("=");
         add = new JButton("+");
         minus = new JButton("-");
         divide = new JButton("/");
         multiply = new JButton("*");
      	
         p.add(equals);
         p.add(add);
         p.add(minus);
         p.add(multiply);
         p.add(divide);
         equals.setSize(50,30);
         add.setSize(50,30);
         minus.setSize(50,30);
         multiply.setSize(50,30);
         divide.setSize(50,30);
         
         equals.setLocation(750, 350);
         add.setLocation(750, 380);
         minus.setLocation(750,410);
         multiply.setLocation(750,440);
         divide.setLocation(750,470);
         
         f.getContentPane().add(equals);
         f.getContentPane().add(add);
         f.getContentPane().add(minus);
         f.getContentPane().add(multiply);
         f.getContentPane().add(divide);
      	
         f.add(p);
         f.setVisible(true);
      	 
      	
      
      
      
      	
      	
      
      
      
      	

      	
      }
    
   }
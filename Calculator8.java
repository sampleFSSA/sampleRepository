import javax.swing.*;

public class Calculator8 
  {
//instance variables
    //To be added later:  ArrayList instance variable 

    //constructor
    public Calculator8()
    {
      JFrame calculator=new JFrame();
      JButton add=new JButton("+");
      JButton subtract=new JButton("-");
      JButton multiply=new JButton("*");
      JButton divide=new JButton("/");

      add.setBounds(400,100,20,20);  
      subtract.setBounds(400,150,20,20);  
      multiply.setBounds(400,200,20,20);  
      divide.setBounds(400,250,20,20);  

    calculator.add(add);
    calculator.add(subtract);
    calculator.add(multiply);
    calculator.add(divide);
      
      calculator.setSize(500,350);
  calculator.setLayout(null);
  calculator.setVisible(true);    
    }
    
    
public static void main(String[] args)
  {
  
  }
    
  }

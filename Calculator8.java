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
        JButton equals=new JButton("=");
      JButton button1=new JButton("1");
        JButton button2=new JButton("2");
        JButton button3=new JButton("3");
        JButton button4=new JButton("4");
        JButton button5=new JButton("5");
        JButton button6=new JButton("6");
        JButton button7=new JButton("7");
        JButton button8=new JButton("8");
        JButton button9=new JButton("9");
        JButton button0=new JButton("0");
      
      add.setBounds(300,50,100,50);  
      subtract.setBounds(300,100,100,50);  
      multiply.setBounds(300,150,100,50);  
      divide.setBounds(300,200,100,50);  
       equals.setBounds(300, 250, 100, 50);
        button7.setBounds(0,50,100,50);
        button8.setBounds(100,50,100,50);
        button9.setBounds(200,50,100,50);
        button4.setBounds(0,100,100,50);
        button5.setBounds(100,100,100,50);
        button6.setBounds(200,100,100,50);
        button1.setBounds(0,150,100,50);
        button2.setBounds(100,150,100,50);
        button3.setBounds(200,150,100,50);
        button0.setBounds(0,200,300,50);
         calculator.add(add); //add component to container
      calculator.add(subtract);
        calculator.add(multiply);
        calculator.add(divide);
        calculator.add(equals);

        calculator.add(button0);
        calculator.add(button1);
        calculator.add(button2);
        calculator.add(button3);
        calculator.add(button4);
        calculator.add(button5);
        calculator.add(button6);
        calculator.add(button7);
        calculator.add(button8);
        calculator.add(button9);
      
      calculator.setSize(500,450);
  calculator.setLayout(null);
  calculator.setVisible(true);    
    }
    
    
public static void main(String[] args)
  {
  Calculator8 myCalculator=new Calculator8();
  }
    
  }

import javax.swing.*;
public class Calculator7 extends JFrame
  {

  public Calculator7()
    {
      JFrame calculatorFrame=new JFrame();
      JButton add=new JButton("+");
      JButton subtract=new JButton("-");
      JButton divide=new JButton("*");
      JButton multiply=new JButton("/");
      add.setBounds(350,0,100,100);
      subtract.setBounds(350,100,100,100);
     multiply.setBounds(350,200,100,100);
     divide.setBounds(350,300,100,100);

      calculatorFrame.add(add);
      calculatorFrame.add(subtract);
      calculatorFrame.add(multiply);
      calculatorFrame.add(divide);
      
      calculatorFrame.setSize(500, 400);
      calculatorFrame.setLayout(null);
      calculatorFrame.setVisible(true);
    }
    
    public static void main(String[] args){}
    
  }

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
      JButton equals=new JButton("=");
      
      add.setBounds(300, 50, 100, 50); 
        subtract.setBounds(300, 100, 100, 50);
        multiply.setBounds(300, 150, 100, 50);
        divide.setBounds(300, 200, 100, 50);
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
         calculatorFrame.add(add); //add component to container
      calculatorFrame.add(subtract);
        calculatorFrame.add(multiply);
        calculatorFrame.add(divide);
        calculatorFrame.add(equals);

        calculatorFrame.add(button0);
        calculatorFrame.add(button1);
        calculatorFrame.add(button2);
        calculatorFrame.add(button3);
        calculatorFrame.add(button4);
        calculatorFrame.add(button5);
        calculatorFrame.add(button6);
        calculatorFrame.add(button7);
        calculatorFrame.add(button8);
        calculatorFrame.add(button9);
      
      calculatorFrame.setSize(500, 450);
      calculatorFrame.setLayout(null);
      calculatorFrame.setVisible(true);
    }
    
    public static void main(String[] args){}
    Calculator7 myCalculator=new Calculator7();
  }

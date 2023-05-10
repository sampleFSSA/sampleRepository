/*Calculator7.java
Code created by AP CSA at FSSA with Mr. Moore amoore@schools.nyc.gov
Version for Calculator lessons 1-4:  This includes JFrame, JButtons, and JTextField. All components have been sized, placed, and added to the container.  All ActionListeners have been added to buttons.  Methods have been created to do calculations.
Lab 12 - Work with your assigned partner over three days.  You may work at home if desired, but this is not required.  Start with code-along code from class, which can be found at our shared GitHub repository at https://github.com/sampleFSSA  
MILD - Add a Mod button (%) to the calculator.  HINT:  This will require you to create the button, set the size and location, add it to the JFrame, add an ActionListener, and update compute() and doMath().  After you have completed this, you should be able to enter 16 % 3 and see 1 on the JTextField.
MEDIUM - Complete Mild, and display all calculations completed by the user as they use the app.  HINT:  One way to do this would be to create a new instance variable String allCalculations and display the results in a new JTextField.  Note that the results will look best if you concatenate a "\n" after each arithmetic expression.
SPICY - Complete Mild and Medium, and allow the user to enter parentheses to determine the order of computation.  HINT:  This requires you to create two buttons, "(" and ")".  Now it is time to rework compute() and doMath().  Right now they can only handle a simple arithmetic expression with two operands and one operator, such as 1+2=  The methods will look for the first instance of the operator and set arg1 to everything before the first operator and set arg2 to everything after the first operator.  How can we make the methods process 1*3+5=?  Would it be possible to have it do 1+3 first and then add 4 to 5?  Now we have to make it prioritize whatever is inside of parentheses, such as 1*(3+5)=.  Could this be done by ordering our if statements?  Would recursion be helpful? */
  
//Import libraries so we can use outside classes and methods.
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
import java.lang.String;

public class Calculator7 extends JFrame
  {
//instance variable
private String currentExpression;

//constructor
public Calculator7()
    {
//declare JFrame container, JButton components, and JTextField component
      JFrame calculatorFrame=new JFrame();
     JTextField outputBox=new JTextField(40);
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
//Set the starting value of instance variable to "" instead of null.
      currentExpression="";
//Set (x, y) positions of components and width and height.
//setBounds(x, y, width,height)
//Remember that the origin is in the top left.  y increases as it goes down, and x increases as it goes right.      
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
        outputBox.setBounds(0,0,400,50);

//Add JButton and JTextFrame components to JFrame container.      
        calculatorFrame.add(add); 
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
        calculatorFrame.add(outputBox);

//Add an ActionListener to each button, and indicate what happens when it is clicked.  When the button is clicked, we concatenate the text "0" to the currentExpression instance variable and set the outputBox to display the entire currentExpression value.  
button0.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="0";          			
      outputBox.setText(currentExpression);  }});		

button1.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="1";          			
      outputBox.setText(currentExpression);  }});		

button2.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="2";          			
      outputBox.setText(currentExpression);  }});		

button3.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="3";          			
      outputBox.setText(currentExpression);  }});		

button4.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="4";          			
      outputBox.setText(currentExpression);  }});		

button5.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="5";          			
      outputBox.setText(currentExpression);  }});		

button6.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="6";          			
      outputBox.setText(currentExpression);  }});		
      
button7.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="7";          			
      outputBox.setText(currentExpression);  }});		

button8.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="8";          			
      outputBox.setText(currentExpression);  }});		
      
button9.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="9";          			
      outputBox.setText(currentExpression);  }});		

add.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="+";          			
      outputBox.setText(currentExpression);  }});		

subtract.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="-";          			
      outputBox.setText(currentExpression);  }});		
      
multiply.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="*";          			
      outputBox.setText(currentExpression);  }});		

divide.addActionListener(new ActionListener(){   
   	 public void actionPerformed(ActionEvent e){  	
      currentExpression+="/";          			
      outputBox.setText(currentExpression);  }});		

//When equals is clicked, use the compute() method to calculate the value of the arithmetic expression.  Convert it from a double to a String, and display it in the outputBox.  Then, set currentExpression to "" again so they can start over.
      equals.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){            outputBox.setText(String.valueOf(compute()));  
   currentExpression="";          
    } });
      calculatorFrame.setSize(500, 450);
      calculatorFrame.setLayout(null);
      calculatorFrame.setVisible(true);
    }

//Check to see if "+", "-", "*", or "/" appears in the currentExpression instance variable String.  If so, call the doMath method with the location of that operator in the String.    
public double compute() 
    { int plusLocation=currentExpression.indexOf("+"); 
	if (plusLocation>-1) {return doMath(plusLocation, "+");}
      int minusLocation=currentExpression.indexOf("-");
if (minusLocation>-1) {return doMath(minusLocation, "-");}
      int multiplyLocation=currentExpression.indexOf("*");
	if (multiplyLocation>-1) {return doMath (multiplyLocation, "*");}
      int divideLocation=currentExpression.indexOf("/"); 
 	if (divideLocation>-1) {return doMath (divideLocation, "/");} 
return 0.0;}

//Process arg1 +,-,*,/ arg2 based on the operator passed in.
//Identify arg1 and arg2 using substring()
//Example:  51+3
//indexOf("+") is 2
//arg1 is 51:  substring(0,2)
//arg2 is 3: substring(3)
//operator is +
//convert "51" to 51, and convert "3" to 3
//cast (51+3) as a double, and return it
//it will be converted to a string again in the constructor    
public double doMath(int operatorLocation, String operator) 
{	
  String arg1=currentExpression.substring(0,operatorLocation);
String arg2=currentExpression.substring(operatorLocation+1);
if (operator.equals("+")) 
    {return (double) (Integer.parseInt(arg1) + Integer.parseInt(arg2));}
else if (operator.equals("-"))
     {return (double) (Integer.parseInt(arg1) - Integer.parseInt(arg2));}
else if (operator.equals("*"))
     {return (double) (Integer.parseInt(arg1) * Integer.parseInt(arg2));}
else if (operator.equals("/"))
     {return (double) (Integer.parseInt(arg1) / Integer.parseInt(arg2));}
else return 0.0;}

    
    public static void main(String[] args){}
    Calculator7 myCalculator=new Calculator7();
  }

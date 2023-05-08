import javax.swing.*;
public class HelloWorld
  {
    public static void main(String[] args)
    {
    JFrame myFrame=new JFrame();
    JButton myButton=new JButton("Hello world!");
    myButton.setBounds(0,0,100,100);
    myFrame.add(myButton);
  myFrame.setSize(400,500);
  myFrame.setLayout(null);
  myFrame.setVisible(true);
    }}

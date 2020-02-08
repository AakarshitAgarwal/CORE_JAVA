import javax.swing.*;
import java.awt.*;

class GUI
{
public static void main(String ar[])
{
JFrame f=new JFrame();
JButton b=new JButton("Click");
JCheckBox c=new JCheckBox("Java");
JLabel l=new JLabel("(Computer Science)");
JTextField t=new JTextField(20);
JRadioButton r1=new JRadioButton("Male");
JRadioButton r2=new JRadioButton("Female");
f.setLayout(new FlowLayout());
f.add(b);
f.add(c);
f.add(l);
f.add(t);
ButtonGroup gp=new ButtonGroup();
gp.add(r1);
gp.add(r2);
f.add(r1);
f.add(r2);
f.setVisible(true);
f.setSize(400,400);
}
}

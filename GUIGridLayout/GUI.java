import java.awt.*;
class GUI
{
public static void main(String ar[])
{
Frame f=new Frame("Sannata");
Label l1=new Label("Enter Name");
TextField t1=new TextField();
Label l2=new Label("Enter Pno.");
TextField t2=new TextField();
Label l3=new Label("Enter Email");
TextField t3=new TextField();
Button b1=new Button("Clear");
Button b2=new Button("Save");
GridLayout g1=new GridLayout(4,2);
f.setLayout(g1);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(t3);
f.add(b1);
f.add(b2);
f.setSize(400,400);
f.setVisible(true);
f.setResizable(false);
}
}
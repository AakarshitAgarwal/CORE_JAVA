package pack2;
public class Student
{
 private int rollno;
 private String name;  //s captial
   public void setRollno(int r)
    {
      rollno=r;
    }
   public void setName(String n)
    {
      name=n;
    }
   public int getRollno()
   {return(rollno);}
   public String getName()  //String not int
   {return(name);}
}
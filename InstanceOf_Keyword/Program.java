class Program
{
void disp(ABC a1)
{
if (a1 instanceof PQR)
System.out.println("Passed pqr");
else 
System.out.println("Passed xyz");
}
public static void main(String[] args)
{
Program pr=newPQR();
PQR p=newPQR();
XYZ x=newXYZ();
pr.disp(p);
pr.disp(x);
}
}

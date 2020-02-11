abstract class Person{
  abstract void show();
}
class Student extends Person{
  void show()
  {
  System.out.println("Student");    //some code
  }
}
class Abstract_Class2{
 public static void main(String args[]){
  Student s=new Student();
  s.show();
  }
}
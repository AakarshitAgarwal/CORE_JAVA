import java.util.*;
import java.lang.*;
class Rectangle{
   //int lenght=1;
   //int width=1;
    //int l1;
	static double l1;
    static double l2;
    static double w1;
    static double w2;
	static int x1,y1,x2,y2,x3,y3,x4,y4;
    static double p;
	static double a;
    //int l2;
    //int w1;
    //int w2;
 void set(){
 //int x1,y1,x2,y2,x3,y3,x4,y4;
 System.out.println("Enter the first coordinates of the rectangle:");
 Scanner sc=new Scanner(System.in);
 x1=sc.nextInt();
 y1=sc.nextInt();
 System.out.println("Enter the second coordinates of the rectangle:");
 x2=sc.nextInt();
 y2=sc.nextInt();
 System.out.println("Enter the third coordinates of the rectangle:");
 x3=sc.nextInt();
 y3=sc.nextInt();
 System.out.println("Enter the fourth coordinates of the rectangle:");
 x4=sc.nextInt();
 y4=sc.nextInt();
 }
void properties(){ 

 //if((x1>0 && x1<20) && (x2>0 && x2<20) && (x3>0 && x3<20) && (x4>0 && x4<20) && (y1>0 && y1<20) && (y2>0 && y2<20) && (y3>0 && y3<20) && (y4>0 && y4<20))
 //{
 l1 = Math.sqrt( ((x2-x1) * (x2-x1) ) + ( (y2-y1) * (y2-y1)) );
 //System.out.println("Length of the rectangle is: "+l1);
 l2 = Math.sqrt( ((x4-x3) * (x4-x3) ) + ( (y4-y3) * (y4-y3)) );
 System.out.println("Length of the rectangle is: "+l1+" "+l2);
 w1 = Math.sqrt( ((x3-x1) * (x3-x1) ) + ( (y3-y1) * (y3-y1)) );
 w2 = Math.sqrt( ((x4-x2) * (x4-x2) ) + ( (y4-y2) * (y4-y2)) );
 System.out.println("Width of the rectangle is: "+w1+" "+w2);
 //}
 //else{
 //System.out.println("Enter the positive and less than 20 size quadrants");
 //}
}
void check(){
	if(l1==l2 && w1==w2){
		System.out.println("The shape is Rectangle");
		}
	else if(l1==l2 && w1==w2 && l1==w1 ){
		System.out.println("The shape is Square");
	    }
	else{
		System.out.println("The shape is not defined");
	}	
}
void Perimeter(){
	p=2*(l1+w1);
	System.out.println("The perimeter of the rectangle is:"+p);
}
void Area(){
	a=l1*w1;
	System.out.println("The are of rectangle is:"+a);
	}

 /*System.out.println("Enter the third coordinates of the rectangle:
");
 int x3=sc.nextInt();
 int y3=sc.nextInt();
 System.out.println("Enter the fourth coordinates of the rectangle:
");
 int x4=sc.nextInt();
 int y4=sc.nextInt();*/
 }
/*void Calculation(){
    l1 = Math.sqrt((((int x2)-(int x1)) * ((int x2)-(int x1)) ) + ( ((int y2)-(int y1)) * ((int y2)-(int y1))) );
   System.out.println("Length of the rectangle is: "+l1);
 
   //l1 = Math.sqrt( (x2-x1) * (x2-x1) ) + ( (y2-y1) * (y2-y1) );
   //System.out.println("Length of the rectangle is: "+l1);
   }*/

class Rectangle_main{
 public static void main(String[] args){
 int choice;
 do
 {
 System.out.println("Enter the operation which u want to do:");
 System.out.println("1-Set quadrants");
 System.out.println("2-Set properties");
 System.out.println("3-Check shape");
 System.out.println("4-Calculate perimeter");
 System.out.println("5-Calculate area");
 System.out.println("6-To terminate");
 Scanner s=new Scanner(System.in);
 int no=s.nextInt();
 Rectangle r=new Rectangle();

 //r.Calculation();
 
 switch(no)
 {
 	case 1: r.set();
			break;
	case 2: r.properties();
			break;
	case 3: r.check();
			break;
	case 4: r.Perimeter();
			break;
	case 5: r.Area();
			break;
	default: System.out.println("Please enter the correct value");
			break;
 }
 System.out.println("Do you want to continue? 1.Yes 2.No");
 choice=s.nextInt();
 }while(choice==1);
 }
}
  /*if(no==1){
   r.set();	
   break;
 }
 else if(no==2){
 	r.properties();
 }
  else if(no==3){
 	r.check();
 }
 else if(no==4){
 	r.Perimeter();
 }
 else if(no==5){
 	r.Area();
 }
 else if(no ==6)
 {
 	System.exit(0);
 }
 else{
 	 System.out.println("Check the operation");
 }*/
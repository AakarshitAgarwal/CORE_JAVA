class Example
{
    public static void main(String args[])
{
    Box smallBox=new Box();
    smallBox.setdimensions(10,15,15);
    smallBox.showdimensions();
    smallBox= new Box();    
    smallBox.showdimensions();
}
}
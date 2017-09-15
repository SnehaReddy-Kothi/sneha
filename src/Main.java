class Main
{
public static void main(String args[])
{
GetMain obj1=new GetMain();
obj1.run();
Thread t1=new Thread(obj1);
PutMain obj2=new PutMain();
obj2.run();
Thread t2=new Thread(obj2);
t1.start();
t2.start();
}
}
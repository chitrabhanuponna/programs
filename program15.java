class A
{
    int num = 1;
}
  
class B extends A
{
    int num = 2;
  
    void display()
    {
        
        System.out.println("num= " + super.num);
    }
}
  
class Sup
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.display();
    }
}
class A {
    void met1()
    {
        System.out.println("class a");
    }
}
  
class B extends A {
   
    void met2()
    {
        System.out.println("class b");
    }
}

class inherit {
    public static void main(String[] args)
    {
 
        B b= new B();
        b.met1();
        b.met2();
    }
}
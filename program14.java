class A{  
  
  void met(){System.out.println("class a");}  
}  
class B extends A{  
  void met(){System.out.println("class b");
      
  }  
 public static void main(String args[]){  
  B obj = new B();
  obj.met();
  }  
}  
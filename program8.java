public class CallByValue{  
 int a=50;  
  
void change(int a)
{  
 a=a+100;
}  
public static void main(String args[])
{  
   CallByValue cbv=new CallByValue();  
   System.out.println("before change "+cbv.a);  
   cbv.change(500);  
   System.out.println("after change "+cbv.a);  
  
 }  
}
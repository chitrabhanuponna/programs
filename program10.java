class A
{
int a=10;
 int run()
 {
	 return(this.a);
 }
}
public class B
{
   public static void main(String[] args){
	   A obj = new A();

       System.out.println(obj.run());

}
}
  
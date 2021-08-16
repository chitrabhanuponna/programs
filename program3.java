public class Operator {
    public static void main(String[] args) {
        int var1 = 5, var2 = 5;

        System.out.println("increment="+ ++var1+",decrement="+ --var1);
        System.out.println("bitwise complement="+ ~var1);
        System.out.println("addition="+(var1+var2)+",subtraction="+(var1-var2)+",multiplication="+(var1*var2)+",division="+(var1/var2)+",modulo="+(var1%var2));
        System.out.println("bitwise and="+ (var1&var2)+",bitwise or="+(var1|var2)+",bitwise xor="+(var1^var2));
        System.out.println((var1>6) && (var2 >1));
        System.out.println((var1>6) || (var2 >1));
        System.out.println((var1==5)?true:false);
        
    }
}
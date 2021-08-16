public class Room{
int roomno=5;
float roomarea=1200;
String roomtype=a;
int acmachine=102;
public static String setdata(){

}
public void displaydata(){
System.out.println("roomno="+roomno+ ",roomtype"+roomtype);
}
class A{
public static void main(String[] args){
Room r=new Room();
r.setdata();
r.displaydata();
}
}
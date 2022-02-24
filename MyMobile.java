package week1.day2;

public class MyMobile {
static int num=1234;
static char name='D';
static boolean mobilehascamera = true ;
static long mobilenumber =9876543210L;
 public void makecall()
 {
	 System.out.println("make call");
	
 }
 public void sendmsg() 
 {
	 System.out.println("send msg");
	
 }
 private void paybills()
 {
	 System.out.println("paybills");
 }
public static void main(String[]args)
{
	System.out.println(num);
	System.out.println(name);
	System.out.println(mobilehascamera);
	System.out.println(mobilenumber);
	MyMobile obj=new MyMobile();
	obj.makecall();
	obj.sendmsg();
	obj.paybills();
	}
}

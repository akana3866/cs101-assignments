package HW2;
import java.net.InetAddress;

class Exercise11
{
   public static void main(String args[]) throws Exception
   {
      //https://beginnersbook.com/2014/07/java-program-to-get-ip-address/
   	
      InetAddress getIP=InetAddress.getLocalHost();
 
      System.out.println("My IP Address is:" + getIP.getHostAddress());
   
  }
}
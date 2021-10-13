import java.util.Scanner;
public class ExtNum{
public static void main(String args[])
{
  Scanner scan= new Scanner(System.in);
  System.out.println("enter number");
   int num=scan.nextInt();
   scan.close();
   int count=0,p=1,n=num;
   int sqnum=num*num;
   while(n>0){
    p*=10;
    n=n/10;
     }
    if(sqnum%p==num)
      System.out.println("Given number is extension num");
    else
      System.out.println("not an extension num");
  }
}
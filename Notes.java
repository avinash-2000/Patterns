import java.util.Scanner;
public class Notes{
public static void main(String args[]){
int notes[]={2000,1000,500,200,100,50,20,10};
System.out.println("enter amount:");
Scanner scan=new Scanner(System.in);
int amnt=scan.nextInt();
int j=0,x=amnt,count=0;
while(x>=10)
{
  int n=0;
  n=x/notes[j];
  x=x-notes[j]*n;
System.out.println("\n No of"+ notes[j]+"notes:"+n);
count+=n;
j++;
}
System.out.println("no of units:"+amnt%10);
}
}
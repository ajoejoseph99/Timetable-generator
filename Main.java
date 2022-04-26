import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int i=0;
    System.out.println("Enter size:");
    int size=s.nextInt();
    String[] arr=new String[size];
    String sub="";
    while(i<arr.length)
    {
        System.out.println("Entered");
        sub=s.next();
        arr[i]=sub;
        System.out.println("Hi");
        i++;
    }
    
  }
}
import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int i=0;
    int num_subjects,num_periods;
    System.out.println("\nEnter number of subjects: ");
    num_subjects=s.nextInt();
    System.out.println("\nEnter number of periods: ");
    num_periods=s.nextInt();
    String[][] timetable=new String[5][num_periods];
    String[] subjects = new String[num_subjects];
    System.out.println("\nEnter subjects: ");
    for(i=0;i<num_subjects;i++)
      {
        subjects[i]=s.nextLine();
      }
    
  }
}
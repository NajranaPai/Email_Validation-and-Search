 /* Najranabanu Pai*/
import java.util.*;
public class Email_Search {
    ArrayList<String> email_read=new ArrayList<String>();
    static Scanner s=new Scanner(System.in);
    String email;
    boolean b;
    String formate="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    public static void main(String[] args) throws Exception {
        int n;
        System.out.print("How Many Emails do you want to add?? : \t");
        n=s.nextInt();
        Email_Search e=new Email_Search();
        e.email_add(n,s);
        e.email_search();
    }
  
void email_add(int n,Scanner s)
    {
        email=new String();
        System.out.print("Enter All Email Address:\n");
        for (int i=0;i<n;i++)
         {
             System.out.print("\t" +(i+1) +": ");
             email=s.next();
             b=email.matches(formate);
             if(b==true)
             {
               email_read.add(email);
             }
             else
              {
                  System.out.println("\tEmail address that you enter is not valid...")  ;
                  i--;
                  System.out.println("Enter Again:");
              }
         }

    }
private void email_search() 
    {
        int location=0;
        char c;
        c='n';
        do
        {
            System.out.print("\nEnter email address that you want to search...:");
            email=s.next();
            b=email.matches(formate);
            while(b!=true)
            {
                System.out.println("\t\tEmail address that you enter is not valid..")  ;
                System.out.print("Enter Again:");
                email=s.next();
                b=email.matches(formate);
            }
           // System.out.println(email);
             for(int j=0;j<email_read.size();j++)
             {
              if(email.equals(email_read.get(j)))
              {
                 location=j+1;
                 break;
              }
            }
           if(location!=0)
            {
                System.out.println("\n\t Email Address Found At postiotion :" + (location) + "." + email_read.get(location-1) );
            }
            else
            {
               System.out.println("\n\t Searching email does not found in list..");
            }
           System.out.print("Do you Still want to search?");
           c=s.next().charAt(0);
           location=0;

        }while(c=='Y' || c=='y');
    }
}


            
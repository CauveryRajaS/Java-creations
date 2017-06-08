import java.util.Scanner;
public class IntegerEqualsIndex
{
  public static void main(String args[])
  {
     Scanner input=new Scanner(System.in);
     System.out.print("Enter the no. of integers");
     int size=input.nextInt();
     int integers[]=new int[size];
     boolean matches=false;
     for(int index=0;index<size;index++)
     {
         integers[i]=input.nextInt();
     } 
     for(int index=0;index<size;index++)
     {    
         if(integers[index]<integers[index+1]&&index<=size-1)
         {
           if(index==integers[index])
           {
             matches=true;
             System.out.print(index);
           }
         }
         else
         {
             System.out.print("Invalid input:Integers are not in ascending order or unique");
         }
     }
     if(matches==false)
     {
         System.out.print("The indices doesn't the integers");
     }
  }
}  

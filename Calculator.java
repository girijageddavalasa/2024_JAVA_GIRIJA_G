import java.util.Scanner;
public class Calculator{
    public static void main(String []args){
        
        char c;
        do
        {
            
            System.out.println("GG CALCULATOR");
            System.out.println("Menu:\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Modulus");
            System.out.println("enter your choice");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println("eneter number 1");
            int n1=sc.nextInt();
            System.out.println("enter number 2");
            int n2=sc.nextInt();
            switch(a)
            {
                case 1:
                    System.out.println("the addition of numbers ="+(n1+n2));
                    break;
                case 2:
                    System.out.println("the subtraction of numbers ="+(n1-n2));
                    break;
                case 3:
                    System.out.println("the division of numbers ="+(n1/n2));
                    break;
                case 4:
                    System.out.println("the multiplication of numbers ="+(n1*n2));
                    break;
                case 5:
                    System.out.println("the modulus of numbers ="+(n1%n2));
                    break;
                default:
                System.out.println("Invalid input");
                    
                    
            }
            
            System.out.println("do you want to continue? (y/n)");
           c=sc.next().charAt(0);
           
            
        }while(c=='y'||c=='Y');
    }
}

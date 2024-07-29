import java.util.Scanner;
//amstrong number betwen two numbers
public class Amstrong
{       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the first number");
        int n1=sc.nextInt();
        System.out.println("enter the 2nd number");
        int n2=sc.nextInt();
        
        //assuming the given two numbers are having same no.of digts
        int n=n1;
        int sum=0,nd=0;
        while(n>0)
            {
                //n=(i/(10*j))%(10*j);
                n=n/10;
                nd++;
            }
        for (int i=n1;i<=n2;i++)
        {
            n=i;
            while(n>0)
            {//n=(i/(10*j))%(10*j);
                int digit=0;
                digit=n%10;
                sum+=Math.pow(digit,nd);
                n=n/10;
                
            }
            if (sum==i){
                System.out.println(i+" is AMSTRONG NUM ");
                sum=0;
            }
            else{
                System.out.println(i+" is NOT AMSTRONG NUM");
                sum=0;
            }
        }
        }


    }

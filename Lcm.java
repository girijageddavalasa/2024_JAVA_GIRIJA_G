import java.util.Scanner;
public class Lcm {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("enetr two numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        int l=(n1<n2)?n1:n2;
        int lcm=1;
        while (true){
            if (l%n1==0 && l%n2==0){
                lcm=l;
                break;
            }
            l++;
        }
        System.out.println("lcm= "+ lcm);
}}

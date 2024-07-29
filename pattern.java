import java.util.Scanner;
public class pattern{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();//9
        int n2=sc.nextInt();//20
        for(int i=0;i<=n1;i++){
            for (int j=0;j<=n2;j++){
                if (i==0 || j==0 || i==n1 || j==n2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
}
}

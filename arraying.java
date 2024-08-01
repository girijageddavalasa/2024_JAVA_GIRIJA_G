//DECLARING ARRAY
public class arraying{
    public static void main(String[] args){
        int [] arr;
    }
}
----------------------------------------------------------------------------------------------------------------
  public class arraying{
    public static void main(String[] args){
        int []arr=new int[5];
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=50;
        arr[4]=60;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}

----------------------------------------------------------------------------------------------------------------
  import java.util.Scanner;
class student{
    public int roll;
    public String name;
    student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
}
public class Main{
    public static void main(String[] args){
        System.out.println("enetr no.of student deatils=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        student [] arr=new student[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("element at i="+i+": roll="+arr[i].roll+"name"+arr[i].name);
        }
        arr[0]=new student(1,"kamala");
        arr[1]=new student(2,"galatta");
        arr[2]=new student(3,"appna");
        arr[3]=new student(4,"chillak");
        arr[4]=new student(5,"tillak");

        for (int i=0;i<arr.length;i++){
            System.out.println("element at i="+i+": roll="+arr[i].roll+"name"+arr[i].name);
        }


    }
}

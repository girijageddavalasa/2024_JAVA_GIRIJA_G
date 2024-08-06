class student{
    public String name;
    student(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}

public class Main{
    public static void main(String args[]){
        student[] mystudents=new student[]{new student("dharma"),new student("divya"),new student("radha"),new student("lakshmi")};
        for (student m:mystudents)
        {
            System.out.println(m);
        }
    }
}

_______________________________________________________________________________________________

public class excpection {
    public static void main(String args[]){
        int []arr=new int[4];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[4]=40;
        System.out.println("accesing otside the array");
        System.out.println(arr[5]);

    }
}
_______________________________________________________________________________________________


public class excpection {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        sum(arr);
    }
--------------------
public class excpection {
    public static void main(String args[]){
        int [][][]arr=new int[10][20][30];
        arr[0][0][0]=100;
        System.out.println("arr[0][0][0]="+arr[0][0][0]);
    }
}

_________________
public class excpection {
    public static void main(String args[]){
        int [][]arr=new int[10][20];
        arr[0][0]=1;
        System.out.println("arr[0][0]="+arr[0][0]);
    }
____________________________

public static void sum(int[] arr){
    int sum=0;
    for (int i=0;i<arr.length;i++){
        sum+=arr[i];
        System.out.println("sum of array values:"+sum);
    }
}}

_____________
returing an array

public class excpection {
    public static void main(String args[]){
        int arr[]=m1();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }}
        public static int[] m1(){
            return new int[]{1,2,3};
        }
    }

_____________________


public class excpection {
    public static void main(String args[]){
        int iarr[]=new int[3];
        byte barr[]=new byte[3];
        short shortarr[]=new short[3];
        String[] strarr=new String[3];
        System.out.println(iarr.getClass());
        System.out.println(iarr.getClass().getSuperclass());
        System.out.println(barr.getClass());
        System.out.println(shortarr.getClass());
        System.out.println(strarr.getClass());

    }
}

________________________________________________________
clonnign 1d array

public class excpection {
    public static void main(String args[]){
        int arr[]={1,2,3};
        int clone_arr[]=arr.clone();
         //printf flase as deep copy is created
         System.out.println(arr==clone_arr);

         for(int i=0;i<clone_arr.length;i++){
            System.out.println(clone_arr[i]);
         }
    }
}
_______________________________________________________
clonning mutil dimensional arrrray


public class excpection {
    public static void main(String args[]){
        int iarr[][]={{1,2,3},{4,5}};
        int clone_arr[][]=iarr.clone();
        System.out.println(iarr==clone_arr);
        System.out.println(iarr[0]==clone_arr[0]);
        System.out.println(iarr[1]==clone_arr[1]);
    }
}

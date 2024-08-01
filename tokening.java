import java.util.StringTokenizer;
public class tokening{
    public static void main(String [] args){
        StringTokenizer st=new StringTokenizer("hello youtube india happy bday to me to you also"," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        
        
         

    }
}
----------------------------------------------------------------------------------------------------------------

import java.util.StringTokenizer;
public class tokening{
    public static void main(String [] args){
        StringTokenizer st=new StringTokenizer("hello youtube india hello"," ");
        
        System.out.println(st.hasMoreTokens());
        System.out.println(st.nextToken());
         

    }
}
----------------------------------------------------------------------------------------------------------------

import java.util.StringTokenizer;
public class tokening{
    public static void main(String [] args){
        StringTokenizer st=new StringTokenizer("hello,youtube india hello",",");
        
            System.out.println(st.nextToken());
            System.out.println(st.nextToken());
            System.out.println(st.nextToken());
        
       
         

    }
}

----------------------------------------------------------------------------------------------------------------

import java.util.StringTokenizer;
public class tokening{
    public static void main(String [] args){
        StringTokenizer st=new StringTokenizer("hello youtube india happy bday to me to you also"," ");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
        
        
         

    }
}
----------------------------------------------------------------------------------------------------------------
import java.util.StringTokenizer;
public class tokening{
    public static void main(String [] args){
        StringTokenizer st=new StringTokenizer("whenever wherever!happy birthday www","!");
        while(st.hasMoreTokens()){
            System.out.println(st.nextElement());
        }
        
        
         

    }
}
----------------------------------------------------------------------------------------------------------------
  import java.util.StringTokenizer;
public class tokening{
    public static void main(String [] args){
        StringTokenizer st=new StringTokenizer("whenever wherever happy birthday www"," ");
        System.out.println(st.countTokens());
   
    }
}
----------------------------------------------------------------------------------------------------------------
  import java.util.StringTokenizer;
public class tokening{
    public static void main(String [] args){
        StringTokenizer st=new StringTokenizer("whenever wherever!happy birthday www","!");
        while(st.hasMoreTokens()){
            System.out.println(st.hasMoreTokens());
            System.out.println(st.nextElement());
            System.out.println(st.hasMoreElements());
        }
        
        
         

    }
}
----------------------------------------------------------------------------------------------------------------

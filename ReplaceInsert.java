public class ReplaceInsert
{
public static void main(String[] args){
    String s="Hello ",l="Java";
    StringBuffer sb=new StringBuffer(s);
    sb.insert(6,l);
    System.out.println("insert");
    System.err.println(sb);
    System.out.println(s);
    System.out.println(l);
    System.out.println("replaced");
    StringBuffer sl=new StringBuffer(s);
    sl.replace(1,3,l);    
    System.err.println(sl);
    System.out.println(s);
    System.out.println(l);
}}  

public class StringBuilderExample
{
public static void main(String[] args){
    String s="Hello ",l="Java";
    StringBuffer sb=new StringBuffer(s);
    sb.append(l);
    System.out.println(s);
    System.out.println(l);
    System.err.println(sb);
}}  

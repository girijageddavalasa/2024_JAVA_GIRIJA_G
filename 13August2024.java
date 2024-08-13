public class person {
    public String name;
    public String getName(){
        return name;
    }
    public void setname(String newName){
        this.name=newName;
    }
}
FILE 2 
public class Main2 {
    public static void main(String args[]){
        person obj=new person();
        obj.setname("RAMESH");
        System.out.println(obj.getName());
    }
}

________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
public class VECHILE {
    protected String brand="Ford";
    public void honk(){
        System.out.println("tuuuututuut! tuu! dum dum!");
    }
}
class V extends VECHILE {
    private String model="GGTIMES";
    public static void main(String args[]){
       
        
            V obj=new V();
            obj.honk();
            System.out.println(obj.brand+" "+obj.model);
        
         
       
    }
}
________________________________________________
class animal{
    public void Asound(){
        System.out.println("The animal makes sound");
    }
}
class pig extends animal{
    public void Asound(){
        System.out.println("pig says oik ok");
    }
}

class dog extends animal{
    public void Asound(){
        System.out.println("dog barks bow bo bwo");
    }

}

class Main3{
    public static void main(String args[]){
        animal yourAnimal=new animal();
        animal yourPig=new pig();
        animal yourDog=new dog();
        yourAnimal.Asound();
        yourPig.Asound();
        yourDog.Asound();


    }
}
________________________?

class oclass{
    int x=10;
    class iclass{
        int y=5;
    }
}
public class Main3{
    public static void main(String args[]){
        oclass o=new oclass();
        oclass.iclass i=o.new iclass();
        System.out.println(i.y+o.x);
    }
}
____________________________________________
  static inner class 

  class oclass{
    int x=10;
    static class iclass{
        int y=5;
    }
}

public class Main3{
    public static void main(String args[]){
        //oclass o=new oclass();
        oclass.iclass i=new oclass.iclass();
        System.out.println(i.y);
    }
}
__________________________________________________
  class oclass{
    int x=500;
    class iclass{
        public int imethod(){
            return x;
        }
    }
}

public class Main3{
    public static void main(String args[]){
        oclass o=new oclass();
        oclass.iclass i=o.new iclass();
        System.out.println(i.imethod());
    }
}
_______________________________________________
  abstract classses and mehtods 'hide certian info non access modifier
  abstract class animal{
    // abs dont have body
    public abstract void asound();
    public void sleep(){
        System.out.println("zooZzz zoo zzz zooo zeee zooooo^infinty^infinity");
    }
}
class pig extends animal{
    public void asound(){
        //body of abs given here
        System.out.println("the pig says wee woo wee");
    }
}

class Main3{
    public static void main(String args[]){
        pig yourPig=new pig();
        yourPig.asound();
        yourPig.sleep();
    }
}
_________________________________________________________
  interfaces
//another way to do abstration
  interface animal{
    // abs dont have body
    public void asound();
    public void sleep();
}
class pig implements animal{
    public void asound(){
        //body of abs given here
        System.out.println("the pig says wee woo wee");
    }
    public void sleep(){
        //body of abs given here
        System.out.println("your sleep=> zoo zoo zum zumba");
    }
}

class Main3{
    public static void main(String args[]){
        pig yourPig=new pig();
        yourPig.asound();
        yourPig.sleep();
    }
}
_____________________________________________________________________________

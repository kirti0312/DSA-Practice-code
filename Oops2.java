//abstraction
 public class Oops2{
   public static void main(String[]args){
//        // Animal a=new Animal();  //this is not possible bcoz its abstract class and it cant have its object
//         // Horse h=new Horse();
//         // h.eat();
//         // h.walk();
//         // System.out.println(h.color);
//         // Chic c= new Chic();
//         // c.eat();
//         // c.walk();
         Mustang m=new Mustang();
//         //animal->horse->mustang    priority order
//         Horse h=new Horse();
        Bmw b=new Bmw();
      }}
    abstract class Animal{
         String color;
         Animal(){
             System.out.println("Animal constructor called");
             color="brown";
         }
         void eat(){
             System.out.println("animal eats");
         }
         abstract void walk();
     }
     class Horse extends Animal{
         Horse(){
             System.out.println("Horse constructor called");
         }
       void changecolor(){
             color="dark brown";
         }
         void walk(){
             System.out.println("walks on 4 leg");
         }
     }
   class Mustang extends Horse{
         Mustang(){
             System.out.println("MUstang constructor called");
         }
     }
     class Chic extends Animal{
         void changecolor(){
             color="pink";
         }
         void walk(){
            System.out.println("walks on 2 legs");
          }
     }
//INTERFACES

interface Chess{
    void moves();
}
class Queen implements Chess{
   public void moves(){
        System.out.println("l,r,U,DOWN,dia");
    }
}
class Rook implements Chess{
    public void moves(){
        System.out.println("l,r,u,down");
    }
}
class King implements Chess{
    public void moves(){
        System.out.println("l,r,u,d(by 1 styep)");
    }
}
//multiple inheritence using interface
interface Herbi{
    void eats();
    void walks();
    void isplant();
}
interface Carni{
    void eats();
    void walks();
    void isanimal();

}
class Beer implements Herbi,Carni{
    public void eats(){
        System.out.println("eats both");
    }
    public void walks(){
        System.out.println("walks");
    }
    public void isplant(){
        System.out.println("not plant");
    }
    public void isanimal(){
        System.out.println("yes animal");
    }
}
// public class Oops2{
//     public static void main(String[]args){
//        // Queen q=new Queen();
//         //q.moves();
//         //Beer b=new Beer();
//        // b.isanimal();
//         Student s1=new Student();
//         s1.school="ABC";
//         Student s2=new Student();
//         System.out.println(s2.school);
//         Horse h=new Horse();
//         System.out.println(h.color);    //blue
//     }
// }
//static keywrd 
class Student{
    String name;
    int roll;
    static String school;
    static int percentage(int mths,int chem,int phy){     //will be same for every obj but parameter can be different
        return (phy +chem +mths)/3;
    }
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}
//super keyword
// class Animal{
//     String color;
//     Animal(){
//         System.out.println("ani cons");
//         this.color ="red";
//     }
// }
// class Horse extends Animal{
//     String color="blue"; 
//     Horse(){
//         System.out.println(super.color);   //red
//         super.color="pink";    //parent class color has been setted up tp pink (changed)
//         System.out.println(color);   //blue
//          System.out.println(super.color);   //pink
//         System.out.println("horse cons");  
//     }
// }
class Cars{
    Cars(){
        System.out.println("cars constructer is called");
    }
}
class Bmw extends Cars{
    Bmw(){
        System.out.println("Bmw constructer is called");
    }
}
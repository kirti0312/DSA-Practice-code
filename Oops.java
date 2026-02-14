import java.util.*;
public class Oops{
    public static void main(String[] args) {  //public and static both are written in this
        Pen p1=new Pen(); //consruter by default...non parameterized constructer
       // p1.color="yellow";  //this will give error now bcoz the color private access specifier
       Scanner sc = new Scanner(System.in);
        System.out.println(p1.getColor());
        p1.setColor("blue");
        System.out.println(p1.getColor());
        Student s1=new Student();
        s1.name="kirti";
        s1.roll=123;
        s1.password="abc";
        System.out.println(s1.name);
        System.out.println(s1.roll);
        s1=new Student(3);
        // for(int i =0;i<3;i++){
        //     s1.marks[i]=sc.nextInt();
        // }
        // s1.marks[0]=100;
        //  s1.marks[1]=98;
        //  s1.marks[2]=67; 
        //  for(int i =0;i<3;i++){
        //     s1.marks[i]=sc.nextInt();
        // }
        // Student s2=new Student(s1);   //copy
        // s2.password="xyz";
        // s1.marks[2]=900;
        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // }
        Fish shark=new Fish();
        shark.color="blue";    //these properties belong to the object
        shark.eat();
        System.out.println(shark.color);
        Calc c=new Calc();
        System.out.println(c.sum(1,8));
        System.out.println(c.sum((float)1.2,(float)3.3));
        Fish f=new Fish();
        f.eat();
         
    }}


class Pen{
   private int tip;     //atributes
   private String color;
   int getTip(){
    return this.tip;
   }
   String getColor(){   //getter
    return this.color;
   }
    void setColor(String color){  //function //setters
        this.color=color;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    Student(){
        marks=new int[3];
        System.out.println("constructer called");
    }
    Student(int size){
         this.marks=new int[size];
    }
    //copy constructer
    Student(Student s1){        //object as parameter in constructer
        marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
//derived class
class Fish extends Animal{
    int fins;
    void eat(){
            System.out.println("eats grass");
        }
    void swim(){
        System.out.println("swims");
    }
}
//mehtod overloading
class Calc{
    int sum(int a ,int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }    
    int sum(int a ,int b,int c){
        return a+b+c;
    }
}
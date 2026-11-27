
class Person{
    String name;
    Person(){}
    Person(String name){
        this.name=name;
    }

    void displayPerson(){
        System.out.println("Name: "+name);
    }

}

class Student extends Person{
    int id;

    Student(String name,int id){
        super(name);
        this.id=id;
    }

    void displayStudent(){
        System.out.println("Id: "+id);
    }

    void nameStudent(){
        System.out.println("Name: "+name);
    }
}

//create obj in person and student and print
public class Main {
    public static void main(String[] args) {

        System.out.println("==========Person object==========");
        Person p1=new Person();
        p1.name="salman";
        p1.displayPerson();

        System.out.println("===========Student object===========");
        Student s1=new Student("hossen",1234);
        Student s2=new Student("farhad",4567);

        s1.displayStudent();
        s1.nameStudent();

        s2.displayStudent();
        s2.nameStudent();

    }
}


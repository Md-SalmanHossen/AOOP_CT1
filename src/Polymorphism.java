
class Man{
    String name;

//    method overloading: in same class but diff params
    void display(){
        System.out.println("Name: "+name);
    }
    void display(String msg){
        System.out.println("["+msg+ "] name: "+name);
    }

}

class Chatro extends Man{
    int id;

    @Override
    void display() {
        System.out.println("Student name: "+name + " | Student id: "+id);
    }

}



public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("=== ১. METHOD OVERLOADING ===");
        Man p1 = new Man();
        p1.name = "Salman";

        //method a call
        p1.display();
        //method b call
        p1.display("Hello Teacher");


        System.out.println("\n=== ২. METHOD OVERRIDING ===");
        Chatro s1 = new Chatro();
        s1.name = "Rohit";
        s1.id = 101;

        s1.display();
    }
}

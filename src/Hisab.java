class Hisabi {

    private String name;
    Hisabi(){};


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
class Shikkharthi extends Hisabi{

    private  int id;
    Shikkharthi(){};

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if(id>0) this.id = id;
            else System.out.println("Error: cannot -ve balance ");
    }
    void displayStudentInfo(){
        System.out.println("Student name: "+getName()+ "| Id: "+getId());
    }
}

public class Hisab{
    public static void main(String[] args) {

        Shikkharthi s1=new Shikkharthi();
        s1.setName("Salman Hossen");
        s1.setId(101);

        System.out.println("method call");
        System.out.println("Name from parent geter: "+s1.getName());
        System.out.println("Id from chaild getter: "+s1.getId());

        System.out.println("child class display print");
        s1.displayStudentInfo();
    }
}



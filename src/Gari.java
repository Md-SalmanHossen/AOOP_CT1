
class Vehicle{
    String brand;
    Vehicle(String brand){
        this.brand=brand;
    }
    void showBrand(){
        System.out.println("Brand: "+brand);
    }
}

class Car extends Vehicle{
    String model;
    Car(String brand,String model){
        super(brand);
        this.model=model;
    }
    void showCar(){
        System.out.println("Model: "+model);
    }
}
public class Gari {
    public static void main(String[] args) {

        System.out.println("===Vehicle====");
        Vehicle v1=new Vehicle("suzuki");
        v1.showBrand();

        System.out.println("====Car=====");
        Car c1=new Car("abc","xyz");
        c1.showCar();
    }
}

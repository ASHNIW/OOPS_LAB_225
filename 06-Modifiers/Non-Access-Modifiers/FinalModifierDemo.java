class Vehicle {
    final int wheels = 4;
    
    void display() {
        System.out.println("Wheels: " + wheels);
    }
}

public class FinalModifierDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.display();
    }
}

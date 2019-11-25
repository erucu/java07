public class Car extends Vehicle {  

    // Methode
    public String doStuff() {
        return "I am " + this.getBrand() + " and I go zoom zoom zoom!";
    }

    public Car(String brand) {  
        super(brand);  
    }

   

} // Ende class
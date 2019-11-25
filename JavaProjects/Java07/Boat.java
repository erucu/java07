public class Boat extends Vehicle {  
    
    // Methode
    public String doStuff() {
        return "I am " + this.getBrand() + " and I go glug glug!";
    }

    public Boat(String brand) {  
        super(brand);  
    }

} // Ende class
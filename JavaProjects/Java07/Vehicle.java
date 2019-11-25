abstract class Vehicle{
    private String brand;
    private int kilometers;

    // Constructor  
    public Vehicle(String brand) {  
        this.brand = brand;  
        this.kilometers = kilometers;  
    }  

    // getters and setters  
    public String getBrand() {  
        return this.brand;  
    }  

    public void setBrand(String brand) {  
        this.brand = brand;  
    }  

    public int getKilometers() {  
        return this.kilometers;  
    }  

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // Abstract Method
    public abstract String doStuff();
    
    



} // Ende class
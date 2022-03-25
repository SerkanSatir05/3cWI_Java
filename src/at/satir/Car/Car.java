package at.satir.Car;

public class Car {

    private Producer producer;
    private Engine engine;
    private String color;
    private double maximumSpeed;
    private double basePrice;
    private double baseConsumption;
    private double mileage;


    public Car(Producer producer, Engine engine, String color, double maximumSpeed, double baseConsumption, double mileage, double basePrice) {
        this.producer = producer;
        this.engine = engine;
        this.color = color;
        this.maximumSpeed = maximumSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.mileage = mileage;
    }

    public double getSellingPrice() {
        double newSellingPrice = this.basePrice * this.producer.getDiscount();
        System.out.println(newSellingPrice);
        return newSellingPrice;
    }

    public void newBaseComsumption() {
        double newFuelConsumption;
        if (this.mileage >= 50000) {
            newFuelConsumption = this.baseConsumption + (this.baseConsumption * 0.902);
            setBaseConsumption(newFuelConsumption);
            System.out.println(newFuelConsumption);
        } else
            System.out.println(baseConsumption);
            System.out.println("Das Auto verbaucht noch den Basisverbrauch");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(double baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
